package Questao1;

public class PilhaAvaliacao {
	
	 public Object[] pilha;
	 public int pos;

	    public PilhaAvaliacao() {
	        this.pos = -1;
	        pilha = new Object[4];
	    }
	
	public void empilhar(Object valor) {
        if (this.pos < pilha.length - 1) {
            pilha[++pos] = valor;
        }
    }
	
    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return pilha[this.pos--];
    }
    
    public boolean pilhaVazia() {
        if (this.pos == -1) {
            return true;
        }
        return false;
    }
    
    public int tamanho() {
        if (pilhaVazia() == true) {
            return 0;
        }
        return this.pos + 1;
    }

    public Object retornar() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[pos];
    }
}