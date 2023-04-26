package exercicios.operadores;

public class Unarios {

	public static void main(String[] args) {
		// Unários

				int numero = 5;

				// inverter negativo em positivo
				numero = -numero;
				numero = numero * -1;
				System.out.println(numero);

				// Imprimindo o numero negativo
				System.out.println(-numero);

				// incrementando numero em mais 1 numero, imprime 6
				numero++;
				// é igual numero = numero + 1;
				System.out.println(numero);

				// incrementando numero em mais 1 numero, imprime 7
				System.out.println(numero++);// ops algo de errado não está certo
				System.out.println(numero);// agora sim, numero virou 7
				System.out.println(++numero);// ordem de precedencia conta aqui

				boolean verdadeiro = true;
				System.out.println("Inverteu " + !verdadeiro);
				

	}

}
