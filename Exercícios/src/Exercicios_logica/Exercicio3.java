package Exercicios_logica;

import java.util.Scanner;

/**3. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 50, imprimindo uma mensagem
indicando tal fato.*/

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de y:");

	    double y = myObj.nextDouble();

	    if (y > 50) {
	    	  System.out.println("valor é maior que 50");
	    	}
	    
	    

	}

}
