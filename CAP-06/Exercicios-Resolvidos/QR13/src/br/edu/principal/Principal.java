package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR13: Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números su-
		periores a cinquenta e suas respectivas posições. O programa deverá mostrar mensagem se não existir
		nenhum número nessa condição.*/
		
		Scanner sc = new Scanner(System.in);
		
		int []vetor = new int[10];
		boolean achou;
		int i, x;
		
		for(i=0;i<=9;i++) 
		{
			x = i +1;
			System.out.print("Digite o "+ x  + "° número inteiro: ");
			vetor[i] = sc.nextInt();
		}//LENDO
		achou = false;
		
		for(i=0;i<=9;i++) 
		{
			if(vetor[i] > 50) 
			{
				System.out.println(vetor[i] + " - Na " + i + "° posição");
			}
			
		}
		if(achou == false) System.out.print("Não há números superiores a 50");
		
		
		sc.close();
	}

}
