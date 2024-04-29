package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*
		 Questão 3. Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior 
		que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e 
		c) e retornar o resultado para ser impresso.
		*/
		

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o valor de a (maior que 1): ");
		        int a = scanner.nextInt();
		        System.out.print("Digite o valor de b: ");
		        int b = scanner.nextInt();
		        System.out.print("Digite o valor de c: ");
		        int c = scanner.nextInt();
		        
		        int soma = somarDivisiveisPorA(a, b, c);
		        System.out.println("A soma dos números divisíveis por " + a + " entre " + b + " e " + c + " é: " + soma);
		        
		        scanner.close();
		    }
		    
		    public static int somarDivisiveisPorA(int a, int b, int c) {
		        int soma = 0;
		        for (int i = b; i <= c; i++) {
		            if (i % a == 0) {
		                soma += i;
		            }
		        }
		        return soma;
		    }
		}


	