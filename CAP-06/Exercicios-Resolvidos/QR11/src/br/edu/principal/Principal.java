/*11. Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor.
Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (mostrar o mês por
extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.*/

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
			
			for (int i=0; i<10; i++)
			{
				for (int j=0; j<9; j++)
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
				System.out.println(vet[i]);
			}
}
}