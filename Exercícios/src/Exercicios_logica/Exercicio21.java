package Exercicios_logica;

import java.util.Scanner;
import java.lang.Math;

/**21. Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2o grau, calcule
seu DELTA e também as raízes desta equação, imprimindo seus valores.*/
public class Exercicio21 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a:");
	    System.out.println("Entre com o valor de b:");
	    System.out.println("Entre com o valor de c:");
	   
	    double a = myObj.nextDouble();
	    double b = myObj.nextDouble();
	    double c = myObj.nextDouble();
	    
	    /**double delta = myObj.nextDouble();*/
	    
	    double delta = (b*b - (4*a*c));
	    System.out.println("O valor de delta é: " + delta);
	    
	    double x1 = (((b*(-1)) + (Math.sqrt(delta)))/(2*a));
	    double x2 = (((b*(-1)) - (Math.sqrt(delta)))/(2*a));
	    
	    
	    if(delta < 0 ) {
	    	System.out.println("O valor de delta  é negativo, não possuí raízes reais.");
	    }
	    else {
	    	System.out.println("A primeira raiz encontrada é: " + x1);
	    	System.out.println("A segunda raiz encontrada é: " + x2);
	    }
	    	
	    
	    

	}

}
