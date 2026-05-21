package LeitorLog;

public class Evento {
	private static int contador = 0;
	private String linha;
	int id, dia, hora, minuto, segundo;
	String mes, status;
	
	//Construtor da classe evento, este método chama o método que processa a linha e também atribui um ID ao evento
	Evento(String linha) {
		this.linha = linha;
		processarLinha(linha);
		contador++;
		this.id = contador;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*Método de processamento de string, ele quebra o evento em um array de strings, armazenando as informações relevantes de forma ordenada, além
atribuir um status baseado na leitura da string*/
	public void processarLinha(String linha) {
		String[] quebraLinha = linha.split("\\s+");
		mes = quebraLinha[0];
		dia = Integer.parseInt(quebraLinha[1]);
		String[] quebraHora = quebraLinha[2].split(":");
		hora = Integer.parseInt(quebraHora[0]);
		minuto = Integer.parseInt(quebraHora[1]);
		segundo = Integer.parseInt(quebraHora[2]);
		if (linha.contains("disconnected")) {
			status = "DESCONEXAO";
		} else if (linha.contains("connected")) {
			status = "CONEXAO";
		}
	}
	
	//Método que reorganiza a informação processada no método "processarLinha", em uma nova string ordenada para exibição
	@Override
	public String toString() {
		return "ID: " + id + 
				" | " + dia + " / " + mes +
				" " + hora + ":" + minuto + ":" + segundo + 
				" | " + status;
	}
	
}
