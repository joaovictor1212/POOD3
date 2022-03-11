package Exercicios_logica;

import java.util.Scanner;

/**9. Leia três números reais fornecidos pelo usuário. Descubra qual deles é o menor de todos, imprimindo seu valor.*/
public class Exercicio9 {

	public void run() {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de A:");
	    System.out.println("Entre com o valor de B:");
	    System.out.println("Entre com o valor de C:");
	   
	    float a = myObj.nextInt();
	    float b = myObj.nextInt();
	    float c = myObj.nextInt();
	    
	    if ((a < b) && (a < c)) {
	    	System.out.println("A é o menor número de todos, A = " + a);
	    }
	    else {
	    	if((b < a) && (b < c)) {
	    		System.out.println("B é o menor número de todos, B = " + b);
	    		}
	    	else {
	    		System.out.println("C é o menor número de todos, C = " + c);
	    	}
	    	
	    }

	}

}
