package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/*1. Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números
primos e suas respectivas posições. */
				
Scanner scanner = new Scanner(System.in);
				        
int[] vetor = new int[9];
for (int i = 0; i < vetor.length; i++) {
 System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
  vetor[i] = scanner.nextInt();
    }
				        
 System.out.println("Números primos e suas respectivas posições:");
for (int i = 0; i < vetor.length; i++) {
if (ehPrimo(vetor[i])) {
System.out.println("Número primo: " + vetor[i] + ", Posição: " + i);
}
}
				        
scanner.close();
}

				   
public static boolean ehPrimo(int numero) {
if (numero <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(numero); i++) {
if (numero % i == 0) {
return false;
}
}
return true;
}
}


	
