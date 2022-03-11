package Exercicios_logica;

import java.util.Scanner;
/**11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é múltiplo de B ou se B é múltiplo
de A.*/
public class Exercicio11 {

	public void run(){
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Entre com o valor de A:");
		 System.out.println("Entre com o valor de B:");
		   
	    int a = myObj.nextInt();
	    int b = myObj.nextInt();
	    
	    if((a%b == 0)) {
	    	System.out.println("A é divisível por B");
	    }else {
	    	if (b%a == 0) {
	    		System.out.println("B é divisível por A");
	    	}
	    	else {
	    		System.out.println("Números inseridos não são divisíveis");
	    	}
	    }

	}

}
