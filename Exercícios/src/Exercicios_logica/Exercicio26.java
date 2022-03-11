package Exercicios_logica;

import java.util.Scanner;

/**26. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. O programa deve parar de ler
e, portanto somar os valores quando for introduzido o número 0 (zero).*/
public class Exercicio26 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de numeros que quer inserir");
		
		int a = myObj.nextInt();
		int[] listaDeNumeros = new int[a];
		int sum = 0;
		
		
		
		
		for (int i = 0; i < listaDeNumeros.length; i++) {
            System.out.print("Digite "+ i + "° numeros: "); 
			int nextNumber = (myObj.nextInt());
			
			if(nextNumber == 0) {
				i = listaDeNumeros.length + 1;
			}else {
				listaDeNumeros[i] = nextNumber;
				sum += nextNumber;
			}
			
		  }
		  System.out.println("A soma dos numeros inseridos é igual a "+sum);
	}

}
