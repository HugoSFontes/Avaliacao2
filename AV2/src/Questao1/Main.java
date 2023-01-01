package Questao1;


public class Main extends ValidarExpressao{
	
	public static void main(String[] args) {
		
		String expCorreta1 = "{b+c(a+b)} *c";
		String expCorreta2 = "{a+[v-b*(f*i)]}";
		String expErrada1 ="{a+c(b-c})";
		String expErrada2 = "(a-b{h+c})";
		System.out.println(validarExpressao(expCorreta1));
		System.out.println(validarExpressao(expCorreta2));
		System.out.println(validarExpressao(expErrada1));
		System.out.println(validarExpressao(expErrada2));
	}

}
