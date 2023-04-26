package exercicios.operadores;

public class Ternarios {

	public static void main(String[] args) {
		/*
		 * Ternário O operador ternário é representado pelos símbolos ?: utilizados na
		 * seguinte estrutura de sintaxe:
		 */
		
		int a, b;
		a = 5;
		b = 5;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		*/

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String result = (a==b) ? "verdadeiro" : "false";
		System.out.println(result);

	}

}
