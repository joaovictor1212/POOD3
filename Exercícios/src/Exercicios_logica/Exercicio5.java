package Exercicios_logica;

import java.util.Scanner;

/**5. Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar.*/
public class Exercicio5 {

	public void run() {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de X:");
	   
	    int x = myObj.nextInt();
	    
	    if (x%2 == 0) {
	    	 System.out.println("X é par, x = " + x);
	    }
	    else {
	    	 System.out.println("X é ímpar, x =  " + x);
	    }
	 
	}

}
