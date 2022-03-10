package Exercicios_logica;

import java.util.Scanner;

/**15. Escreva um programa que realize as seguintes tarefas:
a)Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
b)Realize a soma dos valores x e y, exibindo seu resultado;
c)Realize o produto dos valores x e y exibindo seu resultado;
d)Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes.*/

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x:");
	    System.out.println("Entre com o valor de y:");
	    
	   
	    int x = myObj.nextInt();
	    int y = myObj.nextInt();
	    
	    System.out.println("O valor da soma de x e y é: " +(int)(x + y));
	    System.out.println("O valor do produto de x e y é: " +(int)(x * y));
	    
	    if (x == y) {
	    	System.out.println("x e y são iguais");
	    }
	    if (x < y) {
	    	System.out.println("x é menor que y");
	    }
	    if(x > y) {
	    	System.out.println("x é maior que y");
	    }
	    
	    

	}

}
