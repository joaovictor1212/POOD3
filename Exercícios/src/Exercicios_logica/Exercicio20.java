package Exercicios_logica;

import java.util.Scanner;

/**20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
uma mensagem e a operação de conversão não deve ser efetuada.*/
public class Exercicio20 {
	
	public void run() {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entre com o valor em metros:");
	
		double m = myObj.nextDouble();
		
		if (m < 0) {
			System.out.println("O valor inserido é negativo não tem conversão para pés");
		}
		else {
			System.out.println("O valor convertido para pés é: "+ (double) m*3.315 );
		}
	
	
	}

}
