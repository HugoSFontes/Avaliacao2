package Questao2;

public class FilaAvaliacao<T> implements IFilaAvaliacao<T> {

	@Override
	public void incluir(T valor) throws FilaCheiaException {
		
	}

	@Override
	public T remover() throws FilaVaziaException {
		return null;
	}

	@Override
	public boolean estaVazia() {
		return false;
	}

	@Override
	public void limpar() {
		
	}

	@Override
	public T visualizarProximo() throws FilaVaziaException {
		return null;
	}
	
	@Override
	public boolean saoIguais(IFila<T> fila1, IFila<T> fila2) {
		return false;
	}


}
