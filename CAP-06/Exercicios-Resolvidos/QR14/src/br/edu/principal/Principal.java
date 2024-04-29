package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR14: Faça um programa que preencha três vetores com cinco posições cada. O primeiro vetor receberá os
		nomes de cinco funcionários; o segundo e o terceiro vetor receberão, respectivamente, o salário e o
		tempo de serviço de cada um. Mostre um primeiro relatório apenas com os nomes dos funcionários
		que não terão aumento; mostre um segundo relatório apenas com os nomes e os novos salários dos 
		funcionários que terão aumento. Sabe-se que os funcionários que terão direito ao aumento são aqueles
		que possuem tempo de serviço superior a cinco anos ou salário inferior a R$ 800,00. Sabe-se, ainda,
		que, se o funcionário satisfizer às duas condições anteriores, tempo de serviço e salário, o aumento
		será de 35%; para o funcionário que satisfazer apenas à condição tempo de serviço, o aumento será de
		25%; para aquele que satisfazer apenas à condição salário, o aumento será de 15%.*/
		
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[5];
		float salario[] = new float[5];
		int []tempo = new int[5];
		int i, x;
		float novo_salario;
		
		for(i = 0;i<=4;i++) 
		{
			x = i + 1;
			System.out.print("Digite o nome do " + x + "° funcionário: ");
			nome[i] = sc.next();
			
			System.out.print("Digite o salário do " + x + "° funcionário: ");
			salario[i] = sc.nextFloat();
			
			System.out.print("Digite o tempo de serviço(anos) do " + x + "° funcionário: ");
			tempo[i] = sc.nextInt();
			System.out.println("");
		}
		
		for(i=0;i<=4;i++) 
		{
			if((tempo[i] <=5) & (salario[i] >= 800)) 
			{
				System.out.println(nome[i] + " não terá aumento.");
			}
		}
		
		for(i=0;i<=4;i++) 
		{
			if((tempo[i] > 5) | (salario[i] < 800)) 
			{
				if ((tempo[i] > 5) & (salario[i] < 800)) 
				{
					novo_salario = 1.35f * salario[i];
				}
				else if(tempo[i] > 5) 
				{
					novo_salario = salario[i] * 1.25f;
				}
				else novo_salario = salario[i] * 1.15f;
				System.out.println(nome[i] + " terá o novo salário de R$" + novo_salario);
			}
		}
		
		sc.close();
	}

}
