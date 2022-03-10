package Exercicios_logica;

import java.util.Scanner;

/**8. Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, imprimindo seu valor.*/
public class Exercicio8 {
		
		public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in);

		    System.out.println("Entre com o valor de A:");
		    System.out.println("Entre com o valor de B:");
		    System.out.println("Entre com o valor de C:");
		   
		    int a = myObj.nextInt();
		    int b = myObj.nextInt();
		    int c = myObj.nextInt();
		    
		    if ((a > b) && (a > c)) {
		    	System.out.println("A é o maior número de todos, A = " + a);
		    }
		    else {
		    	if((b > a) && (b > c)) {
		    		System.out.println("B é o maior número de todos, B = " + b);
		    		}
		    	else {
		    		System.out.println("C é o maior número de todos, C = " + c);
		    	}
		    	
		    }
		
		    
}
}


