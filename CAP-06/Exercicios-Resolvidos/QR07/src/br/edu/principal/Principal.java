/*7. Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene
de forma crescente.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] gabarito = new String [8];
		String [] resposta = new String [8];
		int num, pontos, tot_ap=0, perc_ap, i, j;
		
		for (i=0; i<8; i++)
		{
			System.out.println("Digite a resposta correta da questão " + (i+1) + ":");
			gabarito[i] = sc.next();
		}
		
		for (i=0; i<10; i++)
		{
			System.out.println("Digite o número do " + (i+1) + "º aluno");
			num = sc.nextInt();
			pontos = 0;
			for (j=0; j<8; j++)
			{
				System.out.println("Digite a resposta dada pelo aluno " + num + " à " + (j+1) + "º questão");
				resposta[j] = sc.next();
				if (resposta[j].equals(gabarito[j]))
				{
					pontos++;
				}
			}
		
		System.out.println("A nota do aluno " + num + " foi " + pontos);
		if (pontos>=6)
			{
			tot_ap++;
			}
		}
		
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual de alunos aprovados é " + perc_ap + "%");
		
	}
}