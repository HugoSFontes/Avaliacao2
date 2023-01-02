package Questao2;

public class Main {
	public static void main(String[] args) {
		
	FilaAvaliacao<Integer> filaTeste = new FilaAvaliacao<>(10); //fila para poder chamar o metodo de comparação.
	FilaAvaliacao<Integer> fila1 = new FilaAvaliacao<>(10);
	FilaAvaliacao<Integer> fila2 = new FilaAvaliacao<>(10);
	
		for (int i = 1; i < 4; i++) {
			fila1.incluir(i);
			fila2.incluir(i);
		}
		System.out.println(filaTeste.saoIguais(fila1, fila2)); //retorna true.
		
	
		for (int i = 1; i < 4; i++) {
			fila1.incluir(i+1);
			fila2.incluir(i);
		}
		System.out.println(filaTeste.saoIguais(fila1, fila2)); //retorna false.
		
		while(fila1.estaVazia() == false) { //loop para checar se a fila permaneceu na mesma ordem após comparar ambas.
			System.out.println(fila1.visualizarProximo());
			fila1.remover();
		}
			
	}
}

