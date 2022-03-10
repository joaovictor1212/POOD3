package Exercicios_logica;

import java.util.Scanner;

/**4. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 100, imprimindo uma
mensagem indicando que o "valor é maior que 100" ou uma mensagem indicando que o "valor é menor ou igual a 100".*/

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de y:");

	    double y = myObj.nextDouble();

	    if (y >= 100) {
	    	  System.out.println("valor é igual ou maior que 100");
	    	}
	    else {
	    	System.out.println("valor é menor que 100");
	    }

	}

}
