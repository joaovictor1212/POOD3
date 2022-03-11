package Exercicios_logica;

import java.util.Scanner;

/**27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
nota.*/
public class Exercicio27 {

	public void run() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de alunos");
		
		int a = myObj.nextInt();
		int[] listaDeNotas = new int[a];
		int sum = 0;
		int nota = 0;
		
		
		
		
		for (int i = 0; i < listaDeNotas.length; i++) {
            System.out.print("Digite a nota do "+ i + "° aluno: "); 
			int nextNumber = (myObj.nextInt());
			
			if(nextNumber < 0) {
				i = listaDeNotas.length + 1;
				System.out.println("Valor inserido na última nota foi negativo, \n programa de média parou");
			}else {
				listaDeNotas[i] = nextNumber;
				sum += nextNumber;
				nota ++;
			}
			
		  }
		  if (nota == a) {
			  System.out.println("A soma dos numeros inseridos é igual a "+ (double)sum/a);
		  }
		  

	}

}
