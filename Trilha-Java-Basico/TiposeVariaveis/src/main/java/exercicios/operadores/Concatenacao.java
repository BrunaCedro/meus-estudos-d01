package exercicios.operadores;

public class Concatenacao {

	public static void main(String[] args) {
		/*
		 * Concatenação O operador de adição (+), quando utilizado em variáveis do tipo
		 * texto, realizará a “concatenação de textos”.
		 */

		String nomeCompleto = "LINGUAGEM " + "JAVA";
		System.out.println(nomeCompleto);

		String concatenacao = "?";
		System.out.println(concatenacao);

		// soma e depois adciona texto
		concatenacao = 1 + 1 + 1 + "1";
		System.out.println(concatenacao);

		// Quando o programa percebe texto entre as somas ele entende tudo como caracter
		concatenacao = 1 + "1" + 1 + 1;
		System.out.println(concatenacao);
		concatenacao = 1 + "1" + 1 + "1";
		System.out.println(concatenacao);
		concatenacao = "1" + 1 + 1 + 1;
		System.out.println(concatenacao);

		// Primeiro realiza a soma das evidencias e depois realiza a concatenação
		concatenacao = "1" + (1 + 1 + 1);
		System.out.println(concatenacao);


	}

}
