package br.edu.principal;
import java.util.Arrays;
public class Principal {

	public static void main(String[] args) {
		/**
		 *  Questão 4
		 * Faça um programa que preencha um vetor com oito números inteiros, 
		 * calcule e mostre dois vetores resultantes. O primeiro vetor resultante 
		 * deve conter os números positivos e o segundo, os números negativos. 
		 * Cada vetor resultante vai ter, no máximo, oito posições, 
		 * que não poderão ser completamente utilizadas.
		 */
		
		        int[] vetorOriginal = {3, -8, 4, -2, 1, -6, 8, -7};
		        
		        int[] positivos = new int[vetorOriginal.length];
		        int[] negativos = new int[vetorOriginal.length];
		        
		        int idxPositivos = 0;
		        int idxNegativos = 0;
		        
		        for (int num : vetorOriginal) {
		            if (num > 0) {
		                positivos[idxPositivos++] = num;
		            } else if (num < 0) {
		                negativos[idxNegativos++] = num;
		            }
		        }
		        
		        positivos = Arrays.copyOf(positivos, idxPositivos);
		        negativos = Arrays.copyOf(negativos, idxNegativos);
		        
		        System.out.println("Positivos: " + Arrays.toString(positivos));
		        System.out.println("Negativos: " + Arrays.toString(negativos));
		    }
		


	}


