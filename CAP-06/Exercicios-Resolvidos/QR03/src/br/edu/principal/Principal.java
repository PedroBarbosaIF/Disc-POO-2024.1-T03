package br.edu.principal;
import java.util.Arrays;
public class Principal {

	public static void main(String[] args) {
		/**
		 *  Questão 3
		 * Faça um programa que preencha dois vetores de dez elementos numéricos cada um 
		 * e mostre o vetor resultante da intercalação deles.
		 */
		
		        int[] vetor1 = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
		        int[] vetor2 = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
		        int[] vetorResultante = new int[vetor1.length + vetor2.length];
		        
		        int idxVetor1 = 0;
		        int idxVetor2 = 0;
		        int idxVetorResultante = 0;
		        
		        while (idxVetor1 < vetor1.length && idxVetor2 < vetor2.length) {
		            vetorResultante[idxVetorResultante++] = vetor1[idxVetor1++];
		            vetorResultante[idxVetorResultante++] = vetor2[idxVetor2++];
		        }
		        
		        while (idxVetor1 < vetor1.length) {
		            vetorResultante[idxVetorResultante++] = vetor1[idxVetor1++];
		        }
		        
		        while (idxVetor2 < vetor2.length) {
		            vetorResultante[idxVetorResultante++] = vetor2[idxVetor2++];
		        }
		        
		        System.out.println("Vetor resultante da intercalação:");
		        System.out.println(Arrays.toString(vetorResultante));
		    }
		}


	


