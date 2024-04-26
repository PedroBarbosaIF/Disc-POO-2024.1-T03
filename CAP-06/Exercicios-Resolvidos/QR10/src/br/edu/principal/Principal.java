/*10. Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada

questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros da-
dos são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.

Calcule e mostre:
■■ o número e a nota de cada aluno; e
■■ a porcentagem de aprovação, sabendo-se que a nota mínima é 6.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numtimes = 5;
		int numjogadores = 11;
		
		
		 int totalJogadores = numtimes * numjogadores;
	        int jogmenor18 = 0;
	        int totalidades = 0;
	        double totalalturas = 0;
	        int jogmais80kg = 0;
		
		int[] idades = new int[totalJogadores];
        double[] pesos = new double[totalJogadores];
        double[] alturas = new double[totalJogadores];
        
        for (int i = 0; i < totalJogadores; i++) {
            System.out.println("Digite a idade do jogador " + (i + 1) + ":");
            idades[i] = sc.nextInt();
            System.out.println("Digite o peso do jogador " + (i + 1) + ":");
            pesos[i] = sc.nextDouble();
            System.out.println("Digite a altura do jogador " + (i + 1) + ":");
            alturas[i] = sc.nextDouble();
        
            if (idades[i]<18) {
            	jogmenor18++;
            }
            
            totalidades += idades[i];
            totalalturas += alturas[i];
            
            if (pesos[i] > 80) {
            	jogmais80kg++;
            }
        }
            
            double mediaIdades = (double) totalidades / totalJogadores;
            double mediaAlturas = totalalturas / totalJogadores;
            double porcentagemMais80kg = (double) jogmais80kg / totalJogadores * 100;
            
            System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogmenor18);
            System.out.println("Média das idades dos jogadores: " + mediaIdades);
            System.out.println("Média das alturas dos jogadores: " + mediaAlturas);
            System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
	}
	}
