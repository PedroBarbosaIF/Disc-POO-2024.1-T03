package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR15: Faça um programa que preencha um primeiro vetor com dez números inteiros, e um segundo vetor
		com cinco números inteiros. O programa deverá mostrar uma lista dos números do primeiro vetor com
		seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
		Exemplo de saída do programa:
		
		- Para saber se um número é divisível por outro, deve-se testar o resto.
		Exemplo: RESTO(5/5) = 0*/
		
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int divisores[] = new int[5];
		int i, x, j;
		boolean achou;
		
		for(i=0;i<=9;i++) 
		{
			x= i + 1;
			System.out.print("Digite o " + x + "° número do vetor: ");
			numeros[i] = sc.nextInt();
		}//PREENCHENDO O VETOR NÚMEROS
		System.out.println("");
		
		for(i=0;i<=4;i++) 
		{
			x= i + 1;
			System.out.print("Digite o " + x + "° número dos divisores: ");
			divisores[i] = sc.nextInt();
		}//PREENCHENDO O VETOR DIVISORES
		System.out.println("");
		
		for(i=0;i<=9;i++) 
		{
			achou = false;
			System.out.println(numeros[i]);
			for(j=0;j<=4;j++) 
			{
				x = j +1;
				if(numeros[i]%divisores[j]==0) 
				{
					System.out.println("é ivisível por " + divisores[j] + " na " + x + "° posição.");
					achou = true;
				}
				
			}
			if (achou == false) System.out.println("não há divisores para o número.");
			System.out.println("");
		}
		
		
		
		
		
		sc.close();
	}

}
