package Exercicios_logica;

import java.util.Scanner;
import java.text.DecimalFormat;


/**23. Escreva um programa que receba as seguintes informações: um valor real indicando capital inicial PV, um valor real que
corresponde a taxa de juros da aplicação J e um número inteiro de períodos da aplicação N. O programa deve retornar o
capital futuro FV dado pela relação abaixo:
FV = PV * ( 1 + J ) N  */
public class Exercicio23 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor do capital inicial, PV");
	    System.out.println("Entre com o valor da taxa juros ao ano, J");
	    System.out.println("Entre com o período da aplicação em anos, N");
	   
	    double pv = myObj.nextDouble();
	    double t = myObj.nextDouble();
	    int n = myObj.nextInt();
	    DecimalFormat formatador = new DecimalFormat("0.00");
	    
	    double j = t / 100;  
	    
	    double fv = (pv * Math.pow((1 + j),n));
	    
	    System.out.println("O valor final da aplicação no perído inserido é R$"+ formatador.format(fv));
	}

}
