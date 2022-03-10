package Exercicios_logica;

import java.util.Scanner;

/**22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
PF = P0 + V * T + (A * T 2 ) / 2*/
public class Exercicio22 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor da posição inicial do movel, PO:");
	    System.out.println("Entre com o valor da velocidade do movel V:");
	    System.out.println("Entre com o valor da aceleração do movel A:");
	    System.out.println("Entre com o valor do tempo decorrido: T");
	   
	    double p0 = myObj.nextDouble();
	    double v = myObj.nextDouble();
	    double a = myObj.nextDouble();
	    int t = myObj.nextInt();
	    
	    double pf = (p0+ (v*t) + ((a*(t*t))/2));
	    
	    System.out.println("o valor da posição final PF é igual a: " + pf);

	}

}
