package Exercicios_logica;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	
		 System.out.println("Entre com 0 ou 1 para A:");
		 System.out.println("Entre com 0 ou 1 para B:");
		 System.out.println("Entre com 0 ou 1 para C:");
		   
		    int a = myObj.nextInt();
		    int b = myObj.nextInt();
		    int c = myObj.nextInt();
		    boolean q = false;
		    
		    if((a<0)&&(a>1)) {
		    	System.out.println("Valor inserido fora do especificado:");
		    }else {
		    	if((b<0)&&(b>1)) {
		    		System.out.println("Valor inserido fora do especificado:");
		    	}else {
		    		if((c<0)&&(c>1)) {
			    		System.out.println("Valor inserido fora do especificado:");
		    	}else {
		    		do {
		    			System.out.println("Os Valores inseridos foram: \t" + a +"\t" + b +"\t" +c);
		    			if(a * b * c == 1) {
		    				q = true;
		    			}
		    		}while(q == false);
		    	}
		    }

	}
	}
}
