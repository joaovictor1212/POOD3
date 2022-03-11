package Exercicios_logica;

import java.util.Scanner;

public class Exercicio30 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para a: ");
		int a = input.nextInt() ;
		
		System.out.print("Digite um valor para b: ");
		int b = input.nextInt() ;
		
		System.out.print("Digite um valor minimo para x: ");
		int minX = input.nextInt() ;
		
		System.out.print("Digite um valor maximo para x: ");
		int maxX = input.nextInt() ;
		
		System.out.print("Digite um valor para o incremento de x: ");
		int incX = input.nextInt();
		
		for ( int x = minX; x <= maxX; x += incX ) {
			System.out.println( " y = f(x) = a*x + b = "+ a + "*" + x + " + " + b + " = " + (a*x+b));
		}

	}

}
