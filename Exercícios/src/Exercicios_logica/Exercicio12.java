package Exercicios_logica;

import java.util.Scanner;

/**12. Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.*/
public class Exercicio12 {

	public void run() {
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Entre com a quantidade de copos:");

	    int copos = myObj.nextInt();

	    if (copos <= 100) {
	    	  System.out.println("Valor total é de R$" + (float)copos * 0.05);
	    }
	    if ((copos >=101) && (copos <= 500)) {
	    	 System.out.println("Valor total é de R$" + (float)copos * 0.04);
	    }
	    if (copos > 500) {
	    	System.out.println("Valor total é de R$" + (float)copos * 0.035);
	    }
	}

}
