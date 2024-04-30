package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR11: Foi realizada uma pesquisa sobre algumas características físicas de cinco habitantes de uma região.
	Foram coletados os seguintes dados de cada habitante: sexo, cor dos olhos (A — azuis; ou C — casta-
	nhos), cor dos cabelos (L — louros; P — pretos; ou C — castanhos) e idade. Faça um programa que
	apresente as sub-rotinas a seguir:
	
	- Que leia esses dados, armazenando-os em vetores.
	- Que determine e devolva ao programa principal a média de idade das pessoas com olhos castanhos
	e cabelos pretos.
	- Que determine e devolva ao programa principal a maior idade entre os habitantes.
	- Que determine e devolva ao programa principal a quantidade de indivíduos do sexo feminino com
	idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros.*/
	
	public static void main(String[] args) {
		String sexo[], olhos[], cabelos[];
		int idade[], i, q;
		float m;
		
		sexo = new String[5];
		cabelos = new String[5];
		olhos = new String[5];
		idade = new int[5];
		
		leitura(sexo, olhos, cabelos, idade);
		m = media_idade(olhos, cabelos, idade);
		System.out.println("Média das idades das pessoas com olhos castanhos e cabelos pretos: " + m);
		i = maior_idade(idade);
		System.out.println("A maior idade entre os habitantes: " + i);
		q = qntd_individuos(sexo, olhos, cabelos, idade);
		System.out.println("a quantidade de indivíduos do sexo feminino com\r\n"
				+ "	idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros: " + q);
		
		
	}//FIM MÉTODO MAIN
	
	public static void leitura(String sexo[], String olhos[], String cabelos[],int idade[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		for(x = 0; x<=4; x++) 
		{
			do 
			{
				System.out.print("Qual o sexo do " + (x + 1) + "° indivíduo?(F - feminimo; M - masculino) ");
				sexo[x] = sc.next();
			}while(!(sexo[x].equals("F")) & !(sexo[x].equals("M")));
			System.out.println("");


			do {
				System.out.print("Qual a cor dos olhos do " + (x + 1) + "° indivíduo?(C - castanhos; A - azul) ");
				olhos[x] = sc.next();
			}while(!(olhos[x].equals("C")) & !(olhos[x].equals("A")));
			System.out.println("");

			
			do 
			{
				System.out.print("Qual a cor dos cabelos do " + (x + 1) + "° indivíduo?(C - castanhos; P - pretos; L - loiros) ");
				cabelos[x] = sc.next();
			}while((!cabelos[x].equals("C")) & (!cabelos[x].equals("P")) & (!cabelos[x].equals("L")));
			System.out.println("");
			
			
			System.out.print("Qual a idade do " + (x + 1) + "° indivíduo? ");
			idade[x] = sc.nextInt();
			System.out.println("");
			
			sc.close();
		}
	}//FIM SUB ROTINA LEITURA
	
	public static float media_idade(String olhos[], String cabelos[], int idade[]) 
	{
		int cont, i, soma;
		float media;
		
		soma = 0;
		cont = 0;
		
		for(i=0;i<=4;i++) 
		{
			if(olhos[i].equals("C") & (cabelos[i].equals("P"))) 
			{
				soma = soma + idade[i];
				cont++;
			}
		}
		if(cont == 0) media = 0;
		else media = soma/cont;
		return media;
	}//FIM SUB ROTINA MÉDIA IDADE
	
	public static int maior_idade(int idade[]) 
	{
		int i, maior = 0;
		
		for(i=0;i<=4;i++) 
		{
			if(i==1) maior = idade[i];
			else if (idade[i] > maior)
			{
				maior = idade[i];
			}
		}
		return maior;
	}//FIM SUB ROTINA MAIOR IDADE
	
	public static int qntd_individuos(String sexo[], String olhos[], String cabelos[], int idade[]) 
	{
		int i, qntd;
		
		qntd = 0;
		
		for(i=0;i<=4;i++) 
		{
			if(sexo[i].equals("F") & idade[i] >= 18 & idade[i] <= 35 & olhos[i].equals("A") & cabelos[i].equals("L")) qntd++;

		}
		return qntd;
	}
	
	
}//FIM CLASSE
