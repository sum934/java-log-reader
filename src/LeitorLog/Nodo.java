package LeitorLog;

public class Nodo {
	Evento linha;
	Nodo proximo;
	
	//Método construtor da lista simplesmente encadeada, recebe o evento e adiciona o ponteiro próximo, apontando para o próximo elemento da lista 
	Nodo(Evento linha) {
		this.linha = linha;
		this.proximo = null;
	}

	public Evento getLinha() {
		return linha;
	}

	public void setLinha(Evento linha) {
		this.linha = linha;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
}
