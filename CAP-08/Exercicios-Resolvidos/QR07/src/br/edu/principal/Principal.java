package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR07: Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâme-
	tros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se
	for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida
	ao programa principal para, então, ser mostrada.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float notas[] = new float[3], m;
		String escolha;
		int i;
		
		
		for(i=0;i<=2;i++) 
		{
			System.out.print("Qual o resultado da "+(i+1) + "° nota?: ");
			notas[i] = sc.nextFloat();
		}
		
		do 
		{
			System.out.print("Qual será o tipo da média?(P - ponderada; A - aritmética): ");
			escolha = sc.next();
			
		}while(!(escolha.equals("A")) & !(escolha.equals("P")));
		sc.close();
		
		m = calculo_media(notas, escolha);
		
		System.out.print("Esta é a média: " + m);
	}//FIM MÉTODO MAIN
	
		public static float calculo_media(float notas[], String escolha) 
		{
			float media;
			
			if(escolha.equals("A")) 
			{
				media = (notas[0] + notas[1] + notas[2])/3;
			}
			else media = (notas[0] * 5 + notas[1] * 3 + notas[2] * 2)/10;
			
			return media;
		}
	
	
	
	
}//FIM CLASSE
