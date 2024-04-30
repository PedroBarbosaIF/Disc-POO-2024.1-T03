package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR13: Faça uma sub-rotina que receba um vetor A de dez elementos inteiros como parâmetro. Ao final dessa
	função, deverá ter sido gerado um vetor B contendo o fatorial de cada elemento de A. O vetor B deverá
	ser mostrado no programa principal.*/
	
	public static void main(String[] args) {
		int vetor1[], vetor2[], i, x;
		vetor1 = new int[10];
		vetor2 = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=9;i++) 
		{
			x = i+1;
			System.out.print("Digite o " + x + "° número do vetor: ");
			vetor1[i] = sc.nextInt();
		}
		
		fatorial(vetor1, vetor2);
		
		for(i=0;i<=9;i++) System.out.println(vetor2[i] + " é o fatorial do "+ i + "° número: " + vetor1[i]);
		sc.close();
	}//FINAL MÉTODO MAIN
	
	public static void fatorial(int vetor1[],int vetor2[]) 
	{
		int i, f, j;
		for(i=0;i<=9;i++) 
		{
			if((vetor1[i] == 0) | (vetor1[i] == 1)) vetor2[i] = 1;
			else 
			{
				vetor2[i] = 1;
				for(j=1;j<=vetor1[i];j++) vetor2[i] = vetor2[i] * j;
			}
		}
	}
	
}
