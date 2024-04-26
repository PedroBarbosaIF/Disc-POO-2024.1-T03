/*6. Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resul-
tante de uma ordenação decrescente.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int vet[] = new int[10];
			int aux;
			
		 
			for (int i=0; i<10; i++)
			{
				System.out.println("Digite o " + (i+1) + "° número");
				vet[i] = sc.nextInt();
			}
			
			for (int i=0; i<9; i++)
			{
				for (int j=0; j<9-i; j++)
				{
					if (vet [j] < vet [j+1])
							{
						aux = vet[j];
						vet[j] = vet[j+1];
						vet [j+1] = aux;
							}
				}
			}
			
			for (int i=0; i<10; i++)
			{
				System.out.println("Os números em ordem decrescente: " + vet[i]);
			}
}
}