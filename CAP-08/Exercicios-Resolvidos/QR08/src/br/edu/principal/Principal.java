package br.edu.principal;

import java.util.Scanner;

public class Principal {
	/*Questão resolvida QR08: Crie uma sub-rotina que receba como parâmetro a hora de início e a hora de término de um jogo,
	ambas subdivididas em dois valores distintos: horas e minutos. A sub-rotina deverá retornar a duração
	expressa em minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que
	ele pode começar em um dia e terminar no outro.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora_i, min_i, hora_f, min_f;
		int minutos;
		
		System.out.print("Digite o valor da HORA INICIAL: ");
		hora_i = sc.nextInt();
		
		System.out.print("Digite o valor do MINUTO INICIAL: ");
		min_i = sc.nextInt();
		
		System.out.print("Digite o valor da HORA FINAL: ");
		hora_f = sc.nextInt();
		
		System.out.print("Digite o valor do MINUTO FINAL: ");
		min_f = sc.nextInt();
		
		sc.close();
		
		minutos = calculo(hora_i, min_i, hora_f, min_f);
		
		System.out.print("Esta é a quantidade total de minutos: " + minutos);
		
	}//FIM MÉTODO MAIN
	
	public static int  calculo(int hora_i, int min_i, int hora_f, int min_f) 
	{
		int total_h, total_m, total;
		
		if (min_f < min_i) 
		{
			min_f = min_f + 60;
			hora_f--;
		}
		
		if (hora_f < hora_i) 
		{
			hora_f = hora_f + 24;
		}
		
		total_m = min_f - min_i;
		total_h = hora_f - hora_i;
		total = total_h * 60 + total_m;
		return total;
	}
	
}//FIM CLASSE
