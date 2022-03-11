package Exercicios_logica;

import java.util.Scanner;

/**25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.*/
public class Exercicio25 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de numeros que quer inserir");
		
		int a = myObj.nextInt();
		int[] listaDeNumeros = new int[a];
		int sum = 0;
		
		  for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.print("Digite "+ i + "° numeros: "); 
			listaDeNumeros[i] = (myObj.nextInt());
			sum += listaDeNumeros[i];
		  }
		  System.out.println("A soma dos numeros inseridos é igual a "+sum);
	}

}
