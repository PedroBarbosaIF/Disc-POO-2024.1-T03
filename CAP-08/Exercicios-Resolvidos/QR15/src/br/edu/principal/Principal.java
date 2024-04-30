package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR15: Faça uma sub-rotina que receba como parâmetro um vetor A com cinco números reais e retorne esses
	números ordenados de forma crescente.*/
	public static void main(String[] args) 
	{
		int i,x, vetor[];
		vetor = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=4;i++) 
		{
			x = i +1;
			System.out.print("Digite o " + x + "° número do vetor: ");
			vetor[i] = sc.nextInt();
		}//LENDO
		System.out.println("");
		
		ordena(vetor);
		
		System.out.println("Esta é a ordem dos números no vetor:");
		for(i=0;i<=4;i++) 
		{
			System.out.println(vetor[i]);
		}
		sc.close();
		
	}
	
	public static void ordena(int vetor[]) 
	{
		int i, j, aux;
		
		for(i=0;i<=4;i++) 
		{
			for(j=0;j<=3;j++) 
			{
				if(vetor[j] > vetor[j+1]) 
				{
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
	}

}

