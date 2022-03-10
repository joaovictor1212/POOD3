package Exercicios_logica;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor em segundos:");
	   
	    double seg = myObj.nextDouble();
	    
	    if(seg < 0) {
	    	System.out.println("O valor inserido é negativo não tem conversão para horas");
	    }
	    else {
	    	System.out.println("O valor convertido para horas é: "+ (double) seg/3600 );
	    }
	    

	}

}
