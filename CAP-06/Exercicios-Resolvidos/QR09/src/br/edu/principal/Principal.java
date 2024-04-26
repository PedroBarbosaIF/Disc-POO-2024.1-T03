/*9. Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler
informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze
aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um
menu com as seguintes opções:*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        int voo[] = new int [12], lugares[] = new int [12], i = 0, op = 0, op2 = 0, num_voo = 0;
		        String origem[] = new String [12], destino[] = new String [12], local;
		        Scanner sc = new Scanner(System.in);
		        
		        for (i = 0; i < 12; i++) {
		        	int index = (i + 1);
		        	System.out.println("Número do voo " + index + ": ");
		        	voo[i] = sc.nextInt();
		        	System.out.println("Local de origem do voo " + index + ": ");
		        	origem[i] = sc.next();
		        	System.out.println("Local de destino do voo " + index + ": ");
		        	destino[i] = sc.next();
		        	System.out.println("Lugares disponíveis do voo " + index + ": ");
		        	lugares[i] = sc.nextInt();
		        }
		        
		        do {
		        	System.out.println("1 - Consultar");
		        	System.out.println("2 - Reservar");
		        	System.out.println("3 - Finalizar");
		        	op = sc.nextInt();
		        	
		        	if (op == 1) {
		        		System.out.println("1 - Consulta por voo");
		            	System.out.println("2 - Consulta por origem");
		            	System.out.println("3 - Consulta por destino");
		            	op2 = sc.nextInt();
		            	
		            	if (op2 == 1) {
		            		System.out.println("Digite o número do voo: ");
		            		num_voo = sc.nextInt();
		            		
		            		i = 0;
		            		while (i < 12 && voo[i] != num_voo) {
		            			i = i + 1;
		            		}
		            		
		            		if (i >= 12) {
		            			System.out.println("Voo inexistente");
		            		} else {
		            			System.out.println("Número do voo: " + voo[i]);
		            			System.out.println("Local de origem: " + origem[i]);
		            			System.out.println("Local de destino: " + destino[i]);
		            			System.out.println("Lugares disponíveis: " + lugares[i]);
		            		}
		            	}
		            	if (op2 == 2) {
		            		System.out.println("Digite o local de origem: ");
		            		local = sc.next();
		            	
		            		for (i = 0; i < 12; i++) {
		            			if (local.equals(origem[i])) {
		            				System.out.println("Número do voo: " + voo[i]);
		                			System.out.println("Local de origem: " + origem[i]);
		                			System.out.println("Local de destino: " + destino[i]);
		                			System.out.println("Lugares disponíveis: " + lugares[i]);
		            			}
		            		}
		            	}
		                if (op2 == 3) {
		                	System.out.println("Digite o local de destino: ");
		            		local = sc.next();
		            	
		            		for (i = 0; i < 12; i++) {
		            			if (local.equals(destino[i])) {
		            				System.out.println("Número do voo: " + voo[i]);
		                			System.out.println("Local de origem: " + origem[i]);
		                			System.out.println("Local de destino: " + destino[i]);
		                			System.out.println("Lugares disponíveis: " + lugares[i]);
		            			}
		            		}
		            	}
		        	} 
		        	
		        	if (op == 2) {
		        		System.out.println("Digite o número do voo desejado: ");
		        		num_voo = sc.nextInt();
		        		
		        		i = 0;
		        		while (i < 12 && voo[i] != num_voo) {
		        			i = i + 1;
		        		}
		        		
		        		if (i >= 12) {
		        			System.out.println("Número do voo não encontrado");
		        		} else {
		        			if (lugares[i] == 0) {
		        				System.out.println("Voo lotado");
		        			} else {
		        				lugares[i] = lugares[i] - 1;
		        				System.out.println("Reserva confimada!");
		        			}
		        		}
		        	}
		        } while (op != 3);
			}
		}