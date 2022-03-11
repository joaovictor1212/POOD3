package Exercicios_logica;

import java.util.Scanner;

/**13. Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
(três lados iguais).*/
public class Exercicio13 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A:");
	    System.out.println("Entre com o valor de B:");
	    System.out.println("Entre com o valor de C:");
	   
	    double a = myObj.nextDouble();
	    double b = myObj.nextDouble();
	    double c = myObj.nextDouble();
	    
	    if ((a < (b + c)) && (b < (a + c)) && (c < ( a + b))) {
	    	if ((a == b) && (b == c)) {
	    		System.out.println("É um triângulo equilátero");
	    	}
	    	if((a != b) && (b != c) && (a != c)) {
	    		System.out.println("É um triângulo escaleno");
	    	}
	    	if(((a == b) && (a != c)) || ((a == c) && (a != b) )) {
	    		System.out.println("É um triângulo isósceles");
	    	}
	    }else {
	    	System.out.println("Não é um triângulo");
	    }
	}

}
