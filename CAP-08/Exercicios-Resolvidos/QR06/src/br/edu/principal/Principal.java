package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR06: Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte
	tabela de multiplicação (no exemplo, n = 9):*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Digite um número de 1 a 9: ");
			num = sc.nextInt();
		}while(!(num >= 1) & !(num <=9));
		sc.close();
		
		multiplicação(num);
	}//FIM MÉTODO MAIN
	
	
	public static void multiplicação(int num) 
	{
		int i, j;
		
		for(i = 1; i<=num; i++) 
		{
			for(j = 1; j<=i; j++) 
			{
				System.out.println((i * j));
			}
			System.out.println("");
		}
	}
}//FIM CLASSE
