package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR12: Elabore uma sub-rotina que retorne um vetor com os três primeiros números perfeitos. Sabe-se que um
	número é perfeito quando é igual à soma de seus divisores (exceto ele mesmo). Exemplo: os divisores
	de 6 são 1, 2 e 3, e 1 + 2 + 3 = 6, logo 6 é perfeito.*/
	public static void main(String[] args) 
	{
		int vetor[], i;
		vetor = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de partida para receber os três números perfeitos: ");
		int num = sc.nextInt();
		sc.close();
		perfeitos(vetor, num);
		for(i=0;i<=2;i++) 
		{
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}//FIM MÉTODO MAIN
	
	public static void perfeitos(int vetor[],int num) 
	{
		int a, r, soma, cont;
		
		cont = 0;
		
		while(cont < 3) 
		{
			soma = 0;
			for(a=1;a<=(num-1);a++) 
			{
				r = num%a;
				if(r == 0) soma = soma + a;
			}
			if(soma == num) 
			{
				vetor[cont] = num;
				cont++;
			}
			num = num+1;
		}
	}//FIM SUB-ROTINA

}
