package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR14: Crie uma sub-rotina que receba como parâmetro dois vetores de dez elementos inteiros positivos e
		mostre o vetor união dos dois primeiros.*/
	
	
	public static void main(String[] args) {
		int x,i, vetor1[], vetor2[], vetor3[], cont;
		vetor1 = new int[10];
		vetor2 = new int[10];
		vetor3 = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=9;i++) 
		{
			x = i+1;
			System.out.print("Digite o " + x + "° valor para o 1° vetor: ");
			vetor1[i] = sc.nextInt();
		}
		System.out.println("");
		
		for(i=0;i<=9;i++) 
		{
			x = i+1;
			System.out.print("Digite o " + x + "° valor para o 2° vetor: ");
			vetor2[i] = sc.nextInt();
		}
		System.out.println("");
		
		cont = uniao(vetor1, vetor2, vetor3);
		
		System.out.println("Este é o vetor união dos dois vetores: ");
		for(i=0;i< cont;i++) 
		{
			System.out.println(vetor3[i]);
		}
		
	}//FIM MÉTODO MAIN
	
	public static int uniao(int vetor1[], int vetor2[], int vetor3[]) 
	{
		int i, j, k, cont;
		
		k = 0;
		
		for(i=0;i<=9;i++) 
		{
			cont = 0;
			while((cont < k) & (vetor1[i] != vetor3[cont])) 
			{
				cont++;
			}
			
			if(cont == k) 
			{
				vetor3[k] = vetor1[i];
				k++;
			}
		}//1° VETOR
		
		
		for(i=0;i<=9;i++) 
		{
			cont = 0;
			while((cont < k) & (vetor2[i] != vetor3[cont])) 
			{
				cont++;
			}
			
			if(cont == k) 
			{
				vetor3[k] = vetor2[i];
				k++;
			}
		}//2° VETOR

		
		return k;
	}
	
	
}
