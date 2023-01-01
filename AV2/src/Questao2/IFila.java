package Questao2;

public interface IFila<T> {
    public void incluir(T valor) throws FilaCheiaException;
    public T remover() throws FilaVaziaException;
    public boolean estaVazia();
    public void limpar();
    public T visualizarProximo() throws FilaVaziaException;
}
