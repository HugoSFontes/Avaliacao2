package Questao1;


public class Main extends ValidarExpressao{
	
	public static void main(String[] args) {
		
		String expressaoCorreta1 = "{b+c(a+b)} *c";
		String expressaoCorreta2 = "A+[B*(C+D)] * E";
		String expressaoIncorreta1 ="{a+c(b-c})";
		String expressaoIncorreta2 = "A + B * (C + D] * E";
		System.out.println(validarExpressao(expressaoCorreta1));
		System.out.println(validarExpressao(expressaoCorreta2));
		System.out.println(validarExpressao(expressaoIncorreta1));
		System.out.println(validarExpressao(expressaoIncorreta2));
	}

}
