package Exercicios_logica;

import java.util.Scanner;

/**16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
sabendo que o cálculo da área é dado por:area = (base*altura)/2.*/
public class Exercicio16 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor de base:");
	    System.out.println("Entre com o valor de altura:");
	    
	   
	    int base = myObj.nextInt();
	    int altura = myObj.nextInt();
	    
	    System.out.println("A área do triângulo é: " +(float)((base * altura)/2));

	}

}
