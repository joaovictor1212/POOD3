package Exercicios_logica;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		int n=0,resto1,resto2,div1,div2;
		String centena="",dezena="",unidade="";
		System.out.println("Tecle -1 para sair:");
		System.out.print("Digite um numero entre 0 e 100: ");
		
		Scanner scanner = new Scanner(System.in);    
		n = scanner.nextInt();
		
			while(n<=100 && n!=-1){
				resto1 = n%100;
				resto2 = resto1%10;
				div2 = resto1/10;


				if(resto1 !=0 && resto1>10 && resto1<20) {
					switch(resto1){
						case 11: dezena = "onze"; break;
						case 12: dezena = "doze"; break;
						case 13: dezena = "treze"; break;
						case 14: dezena = "quatorze"; break;
						case 15: dezena = "quinze"; break;
						case 16: dezena = "dezesseis"; break;
						case 17: dezena = "dezessete"; break;
						case 18: dezena = "dezoito"; break;
						case 19: dezena = "dezenove"; break;
					}
				}else{
					switch(div2){
						case 1 : dezena = "dez"; break;
						case 2 : dezena = "vinte"; break;
						case 3 : dezena = "trinta"; break;
						case 4 : dezena = "quarenta"; break;
						case 5 : dezena = "cinquenta"; break;
						case 6 : dezena = "sessenta"; break;
						case 7 : dezena = "setenta"; break;
						case 8 : dezena = "oitenta"; break;
						case 9 : dezena = "noventa"; break;
					}
				}

				if(resto1>=20 || n<10 || resto1<10){
					switch(resto2){
						case 1 : unidade = "um"; break;
						case 2 : unidade = "dois"; break;
						case 3 : unidade = "tres"; break;
						case 4 : unidade = "quatro"; break;
						case 5 : unidade = "cinco"; break;
						case 6 : unidade = "seis"; break;
						case 7 : unidade = "sete"; break;
						case 8 : unidade = "oito"; break;
						case 9 : unidade = "nove"; break;
					}
				}

				
				System.out.println("");
				System.out.print("Digite um numero: ");
				n = scanner.nextInt();
									} /**fim do while */

	}

}
