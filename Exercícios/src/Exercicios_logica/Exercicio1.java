package Exercicios_logica;

import java.util.Scanner;

/**1. Escreva um programa que leia um número inteiro fornecido pelo usuário, armazenando-o numa variável apropriada.
Imprima o valor lido. **/

public class Exercicio1 {

	public void run() {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de X:");
	   
	    int x = myObj.nextInt();
	 
	    System.out.println("X é igual a: " + x); 
	
	}

}
