package Exercicios_logica;

import java.util.Scanner;

/**24. Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
a)Usando enquanto (while)
b)Usando faça-enquanto (do-while)
c)Usando para (for)
Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso.*/
public class Exercicio24 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com o valor um valor entre 1 e 20:");
	   
	    int a = myObj.nextInt();
	    
	    if ((a < 1) || (a > 20)) {
	    	System.out.println("O valor inserido não está dentro do solicitado");
	    }
	    else {
	    	int i = 0;
	    	System.out.println("\nUsando While!");
	    	while (i < 11) {
	    	  System.out.println(a + "x" +i+ " = " + (int)a * i);
	    	  i++;
	    	}
	    	System.out.println("\nUsando do-While!");
	    	int j = 0;
	    	do {
	    		System.out.println(a + "x" +j+ " = " + (int)a * j);
	    	  j++;
	    	}
	    	while (j < 11);
	    	System.out.println("\nUsando for!");
	    	for(int k =0; k<11; k++) {
	    		System.out.println(a + "x" +k+ " = " + (int)a * k);
	    	}
	    	
	    }

	}

}
