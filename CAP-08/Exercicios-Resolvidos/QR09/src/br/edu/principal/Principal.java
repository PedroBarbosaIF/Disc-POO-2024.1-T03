package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR09: Faça uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.*/
	public static void main(String[] args) {
		maior_menor();
		
	}
	
	public static void maior_menor()
	{
		Scanner sc = new Scanner(System.in);
		
		int i, num, maior = 0, menor = 0;
		
		for(i=0;i<=4;i++) 
		{
			System.out.print("Digite o " + (i + 1) + "° número: ");
			num = sc.nextInt();
			
			if(i==1) 
			{
				maior = num;
				menor = num;
			}
			
			else if(num > maior)
			{
				maior = num;
			}
			
			else if(num < menor) menor = num;
		}//FINAL FOR
		sc.close();
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
		

	}
}
