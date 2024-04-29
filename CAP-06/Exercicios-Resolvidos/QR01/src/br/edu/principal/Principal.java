package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        // Preenchendo o vetor com 9 n�meros inteiros
		        int[] vetor = new int[9];
		        for (int i = 0; i < vetor.length; i++) {
		            System.out.print("Digite o " + (i + 1) + "� n�mero inteiro: ");
		            vetor[i] = scanner.nextInt();
		        }
		        
		        System.out.println("N�meros primos e suas respectivas posi��es:");
		        for (int i = 0; i < vetor.length; i++) {
		            if (ehPrimo(vetor[i])) {
		                System.out.println("N�mero primo: " + vetor[i] + ", Posi��o: " + i);
		            }
		        }
		        
		        scanner.close();
		    }
		    
		    // M�todo para verificar se um n�mero � primo
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


	
