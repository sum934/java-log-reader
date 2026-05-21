package LeitorLog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AppLeitorLog {
	public static void main(String[] args) {
		
		//Cria uma nova fila para armazenar os eventos
		FilaLog fila = new FilaLog();
		try {
			Scanner scanner = new Scanner(new File("syslog_copia.log"));
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine().toLowerCase();
				if (linha.contains("disconnected") || linha.contains("connected")) {
						fila.enfileirar(linha);
					}
			}
			//Depois de lido o documento e filtrado, o código gera o output
			System.out.println("Logs filtrados e enfileirados:");
			fila.mostrarFila();
			fila.contarEventos();
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
