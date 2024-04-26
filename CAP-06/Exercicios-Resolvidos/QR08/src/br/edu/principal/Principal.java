/*8. Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-
-os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições, composto pela junção
dos elementos dos vetores anteriores, também ordenado de maneira crescente.s*/
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] x = new int [5];
		int [] y = new int [5];
		int [] r = new int [10];
		int i, j, aux;
		
		for (i=0; i<5; i++)
				{
					System.out.println("Digite o " + (i+1) + " valor de x: ");
					x[i] = sc.nextInt();
				}
		
				for (i=0; i<4; i++)
				{
					for (j=0; j<4; j++)
					{
						if (x[j] > x[j+1])
						{
							aux = x[j];
							x[j] = x[j+1];
							x[j+1] = aux;
						}
					}
				}
				
				for (i=0; i<5; i++)
				{
					System.out.println("Digite o " + (i+1) + " valor de y: ");
					y[i] = sc.nextInt();
				}
				
				for (i=0; i<4; i++)
				{
					for (j=0; j<4; j++)
					{
						if (y[j] > y[j+1])
						{
							aux = y[j];
							y[j] = y[j+1];
							y[j+1] = aux;
						}
					}
				}
				
				j=0;
				
				for (i=0; i<5; i++)
				{
					r[j] = x[i];
					j = j + 1;
					r[j] = y[i];
					j = j + 1;
				}
				
				for (i=0; i<9; i++)
				{
					for (j=1; j<9; j++)
					{
						if (r[j] > r[j+1])
						{
							aux = r[j];
							r[j] = r[j+1];
							r[j+1] = aux;
						}
					}
				}
				
				System.out.println("Valores ordenados de x: ");
				for (i=0; i<5; i++)
				{
					System.out.println(x[i]);
				}
				
				System.out.println("Valores ordenados de y: ");
				for (i=0; i<5; i++)
				{
					System.out.println(y[i]);
				}
				
				System.out.println("Valores ordenados de r: ");
				for (i=0; i<10; i++)
				{
					System.out.println(r[i]);
				}
	}

}
