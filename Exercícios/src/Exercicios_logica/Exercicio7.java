package Exercicios_logica;

import java.util.Scanner;

/**7. Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário, exibindo respostas
F ou V para as seguintes questões:
(a) A é igual a zero?
(b) B é menor que zero; e
(c) A OU B são maiores do que zero?
Use operadores lógicos para formular as expressões necessárias a avaliação dos valores.*/
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com o valor de A:");
	    System.out.println("Entre com o valor de B:");
	   
	    int a = myObj.nextInt();
	    int b = myObj.nextInt();
	    
	    
	    if (a == 0) {
	    	System.out.println("A é igual a 0? \nsim (V) a = " + a); 
	    }else {
	    	System.out.println("A é igual a 0? \nnão (F) a = " + a);  
	    }
	    if (b < 0) {
		    System.out.println("\nB é menor que 0? \nsim (V) b = " + b); 
		}else {
			System.out.println("\nB é menor 0? \nnão (F) b = " + b);
		}
	    if ((a > 0)||(b > 0)) {
		    System.out.println("\nA e B são maiores que 0? \nsim (V) a=" + a + " b=" + b); 
		}else {
			System.out.println("\nA e B são maiores que 0? \nnão (F) a=" + a + " b=" + b); 
		}

	}

}
