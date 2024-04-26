/*12. Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca,
Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um
deles faz com um litro de combustível. Calcule e mostre:
■■ o modelo de carro mais econômico; e

■■ quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distân-
cia de 1.000 km.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int consumo[] = new int[5];
		int menor_cons = 0, menor_vei = 0, valor, i;
		String veiculo[] = new String [5];
		
		
		for (i=0; i<=4; i++) {
			System.out.println("Digite o " + (i+1) + "° veículo");
			veiculo[i] = sc.next();
		}
		for (i=0; i<=4; i++) {
			System.out.println("Digite o consumo do " + (i+1) + "° veículo, em quilômetros por litro:");
			consumo[i] = sc.nextInt();
			valor = 1000/consumo[i];
			System.out.println("O veículo " + veiculo[i] + " consome "+ valor + " litro(s) de combustível para percorrer 1000 Km");
			if (i==0) {
				menor_cons=consumo[i];
				menor_vei=i;
			}else {
				if (consumo[i]>menor_cons) {
					menor_cons = consumo[i];
					menor_vei = i;
				}
			}
			System.out.println("\n");
		}
		System.out.println("O veículo mais econômico é o "+ veiculo[menor_vei]+", pois ele faz "+(consumo[menor_vei])+"km/L.");

	}

}