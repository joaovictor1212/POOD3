package Exercicios_logica;

import java.util.Scanner;

/**29. Faça um programa que exiba a tabela verdade da operação OU-Lógico para todas as combinações de três variáveis
lógicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V.*/
public class Exercicio29 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		for(int a=0; a<=1; a++) {
			for (int b = 0; b<=1; b++) {
				for(int c =0; c<=1; c ++) {
					System.out.println( (a==1) +" OU "+ (b==1) +" OU "+ (c==1) +" = "+ ( a==1 || b==1 || c==1 ) );
				}
			}
		}
	
	}
}
