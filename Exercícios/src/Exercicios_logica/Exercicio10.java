package Exercicios_logica;

import java.util.Arrays;
import java.util.Scanner;

/**Leia três números quaisquer, imprimindo-os em ordem crescente.*/
public class Exercicio10 {

	public void run() {
		Scanner myObj = new Scanner(System.in);

		int[] listaDeNumeros = new int[4];
        
        /** Preenche o Array a partir da posição 1*/
        for (int i = 1; i < listaDeNumeros.length; i++) 
        {
            System.out.print("Digite "+ i + "° numeros: "); 
			listaDeNumeros[i] = (myObj.nextInt());
	       }
        
        /** Coloca o Array em ordem crescente*/
        Arrays.sort(listaDeNumeros);
        
        /** Lista o Array em ordem crescente*/
       System.out.print("Ordem crescente:    "); 
    	  for (int j = 1; j < listaDeNumeros.length; j++) 
    	  {
    		System.out.print(listaDeNumeros[j]+ "  ");       		
		  }
    	  
    	           
     	 
}
	  

}


