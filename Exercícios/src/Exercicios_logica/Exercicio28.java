package Exercicios_logica;

import java.util.Scanner;

public class Exercicio28 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		for(int a=0; a<=1; a++) {
			for (int b = 0; b<=1; b++) {
				for(int c =0; c<=1; c ++) {
					System.out.println( (a==1) +" E "+ (b==1) +" E "+ (c==1) +" = "+ ( a==1 && b==1 && c==1 ) );
				}
			}
		}
	
	}
}
