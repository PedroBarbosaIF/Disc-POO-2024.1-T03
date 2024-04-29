package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/*
		Questão 4. Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina deverá converter
		o valor de segundos para horas, minutos e segundos. Todas as variáveis devem ser passadas como parâmetro,
		não havendo variáveis globais.
		*/
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o valor em segundos: ");
		        int segundos = scanner.nextInt();
		        scanner.close();
		        
		        int[] tempo = converterSegundos(segundos);
		        System.out.println("Horas: " + tempo[0]);
		        System.out.println("Minutos: " + tempo[1]);
		        System.out.println("Segundos: " + tempo[2]);
		    }
		    
		    public static int[] converterSegundos(int segundos) {
		        int[] tempo = new int[3];
		        tempo[0] = segundos / 3600; // Horas
		        segundos %= 3600;
		        tempo[1] = segundos / 60; // Minutos
		        tempo[2] = segundos % 60; // Segundos
		        return tempo;
		    }
		}

