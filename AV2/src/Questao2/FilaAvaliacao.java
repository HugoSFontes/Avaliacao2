package Questao2;

public class FilaAvaliacao<T> implements IFilaAvaliacao<T> {
	
	  private T[] fila;
	  private int inicio;
	  private int fim;
	  private int tamanho = 0;
	  
	  
	public FilaAvaliacao(int capacidade) {
		    fila = (T[]) new Object[capacidade];
		  }
	
	public void incluir(T valor) {
		if (tamanho == fila.length) {
		      throw new IllegalStateException("Fila cheia");
		    }
		    fila[fim] = valor;
		    fim = (fim + 1) % fila.length;
		    tamanho++;
	}

	public T remover() {
		 if (tamanho == 0) {
		      throw new IllegalStateException("Fila vazia");
		    }
		    T valor = fila[inicio];
		    fila[inicio] = null;
		    inicio = (inicio + 1) % fila.length;
		    tamanho--;
		    return valor;
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}

	public void limpar() {
		tamanho = 0;
		inicio = 0;
		fim = 0;
	}

	public T visualizarProximo(){
		if(tamanho == 0) {
			throw new IllegalStateException("Fila vazia");
		}
		return fila[inicio];
	}
	
	public boolean saoIguais(IFila<T> fila1, IFila<T> fila2) {
		if(fila1.estaVazia() && !fila2.estaVazia() || fila2.estaVazia() && !fila1.estaVazia()) { //verifica se uma está vazia, para retornar false antes do loop.
			return false;
		}
			
			while (!fila2.estaVazia()) { //enquanto fila1 não estiver vazia, verifica o próximo valor da fila.
				
				T valor1 = fila1.visualizarProximo();
				T valor2 = fila2.visualizarProximo(); 
					if(!valor1.equals(valor2)) { //se os valores forem diferentes, então retorna falso.
						return false;
					}
					
					fila1.remover(); //após verificar os valores, irá remover o atual, e reiniciar o loop
					fila2.remover();		
			}
			  return true;
	}

}
