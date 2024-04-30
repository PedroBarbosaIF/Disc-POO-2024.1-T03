package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR10: Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S,
	obtido pelo seguinte cálculo:
	S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
	*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		double s;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		s = sequencia(num);
		
		System.out.println("Resultado com base no cálculo:");
		System.out.println("S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
		System.out.println(s);
		
		sc.close()
;	}//FIM MÉTODO MAIN
	
	
	public static double sequencia(int num) 
	{
		double  seq, a, b, f;
		
		seq = 1;
		
		for(a=1;a<=num;a++) 
		{
			f = 1;
			for(b=1;b<=a;b++) 
			{
				f = f *b;
			}
			seq = seq + (1/f);
		}
		return seq;
	}//FIM SUB ROTINA SEQUÊNCIA
}//FIM CLASSE
