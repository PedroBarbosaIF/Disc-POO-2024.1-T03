package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/*
		Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se
		for negativo.
		*/
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite um número: ");
		        int numero = scanner.nextInt();
		        
		        int resultado = verificaPositivoNegativo(numero);
		        System.out.println("Resultado: " + resultado);
		        
		        scanner.close();
		    }
		    
		    public static int verificaPositivoNegativo(int numero) {
		        if(numero >= 0) {
		            return 1;
		        } else {
		            return 0;
		        }
		    }
		

}
