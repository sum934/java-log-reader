package LeitorLog;

public class FilaLog {
	
	Nodo inicio;
	Nodo fim;
	
	//Método construtor
	public FilaLog (){
		this.inicio = null;
		this.fim = null;
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getFim() {
		return fim;
	}

	public void setFim(Nodo fim) {
		this.fim = fim;
	}
	
	//Método que armazena o evento na estrutura de dados do tipo fila
	public void enfileirar(String linha) {
		Evento novoEvento = new Evento(linha);
		Nodo novo = new Nodo(novoEvento);
		
		if (fim == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
	}
	
	//Método de remoção de eventos da fila
	public Nodo desenfileirar() {
		if (this.inicio == null) {
			return null;
		} else {
			Nodo nodoRemovido = this.inicio;
			this.inicio = inicio.proximo;
			if (this.inicio == null) {
				this.fim = null;
		}
		return nodoRemovido;
	  }
    }
	
	//Método de exibição da fila
	public void mostrarFila() {
		Nodo nodoAux = this.inicio;
		while (nodoAux != null) {
			System.out.println(nodoAux.getLinha());
			nodoAux = nodoAux.proximo;
		}
	}
	
	//Método para descobrir se a fila está vazia
	public boolean filaVazia() {
		if (this.inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para limpar toda a fila
	public void limparFila() {
		this.inicio = null;
		this.fim = null;
	}
	
	//Método de contagem dos elementos da fila e exibição
	public void contarEventos() {
		int totalEventos = 0;
		Nodo nodoAux = this.inicio;
		while (nodoAux !=null ) {
			totalEventos++;
			nodoAux = nodoAux.proximo;
		}
		System.out.println("Número total de eventos de conexão e desconexão é: " + totalEventos);
	}
}
