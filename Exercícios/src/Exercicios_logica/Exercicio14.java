package Exercicios_logica;

import java.util.Scanner;
/**14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7.*/
public class Exercicio14 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor da nota1:");
	    System.out.println("Entre com o valor da nota2:");
	    System.out.println("Entre com o valor da nota3:");
	   
	    double a = myObj.nextDouble();
	    double b = myObj.nextDouble();
	    double c = myObj.nextDouble();
	    
	    
	    System.out.println("O valor da média é: " +(double)(a + b + c)/3);
	    
	    if (((double)(a + b + c)/3) >= 7) {
	    	System.out.println("\nAluno está aprovado");
	    }
	    if((double)(a + b + c)/3 <= 3) {
	    	System.out.println("\nAluno está reprovado");
	    }
	    if (((double)(a + b + c)/3 < 7) && (double)(a + b + c)/3 > 3){
	    	System.out.println("\nAluno está de exame");
	    }

	}

}
