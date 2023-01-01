package Questao1;

public class ValidarExpressao {
	//para a expressão ser válida, a pilha no final deve estar vazia, ou seja, retornar True.
	
	public static boolean validarExpressao(String equacao){
		PilhaAvaliacao pilha = new PilhaAvaliacao();

		for(int i = 0; i < equacao.length(); i++) { //percorre cada elemento da String.
			char c = equacao.charAt(i); //recolher o atual simbolo a ser consultado.
			if(c =='(' || c=='[' || c == '{') {
				pilha.empilhar(c); //caso encontrado na String, ele empilha o simbolo atual.
			} else if( c == ')' || c == ']' || c== '}') {
				if(pilha.pilhaVazia()) {
					return false; // Caso não encontre a abertura da expressão, ou seja, a pilha vazia e encontre o fechamento, retorna falso.
				}
			char simbolo = (char) pilha.desempilhar(); // desempilha, caso a pilha tenha conteúdo
				if((c==')' && simbolo != '(') || (c==']' && simbolo != '[') || (c=='}' && simbolo != '{')) { //verifica se o simbolo a ser retirado é o fechamento do que está sendo examinado
					return false;
				}
			}
		}
		return pilha.pilhaVazia();
	}
}
		
//obs. Não consegui implementar a pilha com generics, então usei Object, que achei ser algo próximo.