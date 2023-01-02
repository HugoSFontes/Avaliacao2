package Questao2;

public interface IFila<T> {
    public void incluir(T valor);
    public T remover();
    public boolean estaVazia();
    public void limpar();
    public T visualizarProximo();
}
