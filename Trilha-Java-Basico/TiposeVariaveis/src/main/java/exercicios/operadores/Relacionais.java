package exercicios.operadores;

public class Relacionais {

	public static void main(String[] args) {

		/*
		 * Relacionais == Quando desejamos verificar se uma variável é IGUAL A outra. !=
		 * Quando desejamos verificar se uma variável é DIFERENTE da outra. > Quando
		 * desejamos verificar se uma variável é MAIOR QUE a outra. >= Quando desejamos
		 * verificar se uma variável é MAIOR OU IGUAL a outra. < Quando desejamos
		 * verificar se uma variável é MENOR QUE outra. <= Quando desejamos verificar se
		 * uma variável é MENOR OU IGUAL a outra.
		 */

		int numero1 = 1;
		int numero2 = 2;
		boolean resultado = numero1 == numero2;
		System.out.print("Numero1 é igual a Numero2 ? " + resultado); //false

	//Para numeros utilizamos objetos relacionais e para objetos utilizamos equals
		
		String nomeUm = "Bruna";
		String nomeDois = "Bruna";

		System.out.println(nomeUm == nomeDois); //true
		// ComparacaoAvancada
		String nome1 = "Bruna";
		String nome2 = new String("Bruna");

		System.out.println(nome1 == nome2); //false
		// A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
		System.out.println(nome1.equals(nome2));//true

		

	}

}
