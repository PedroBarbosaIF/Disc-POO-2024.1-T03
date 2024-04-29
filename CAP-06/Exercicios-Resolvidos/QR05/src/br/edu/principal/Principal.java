package br.edu.principal;
import java.util.Arrays;
public class Principal {

	public static void main(String[] args) {
		/*5. Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre 
os seguintes vetores resultantes:
■■ A união de X com Y 
(todos os elementos de X e de Y sem repetições). 
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
União 3 8 4 2 1 6 7 11 9 5 12 0
1 2 3 4 5 6 7 8 9 10 11 12
■■ A diferença entre X e Y 
(todos os elementos de X que não existam em Y, sem repetições). 
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Diferença 8 7 11 9
1 2 3 4
■■ A soma entre X e Y 
(soma de cada elemento de X com o elemento de mesma posição em Y). 
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Soma 5 9 9 14 4 6 9 11 16 15
1 2 3 4 5 6 7 8 9 10
■■ O produto entre X e Y 
(multiplicação de cada elemento de X com o elemento de mesma posição em Y). 
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10 y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Produto 6 8 20 24 3 0 8 28 55 54
1 2 3 4 5 6 7 8 9 10
■■ A intersecção entre X e Y 
(apenas os elementos que aparecem nos dois vetores, sem repetições). 
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Intersecção 3 4 2 1 6
1 2 3 4 5*/

		
		        int[] x = {3, 8, 4, 2, 1, 6, 8, 7, 11, 9};
		        int[] y = {2, 1, 5, 12, 3, 0, 1, 4, 5, 6};
		        
		        int[] uniao = uniaoVetores(x, y);
		        System.out.println("União: " + Arrays.toString(uniao));
		        
		        int[] diferenca = diferencaVetores(x, y);
		        System.out.println("Diferença: " + Arrays.toString(diferenca));
		        
		        int[] soma = somaVetores(x, y);
		        System.out.println("Soma: " + Arrays.toString(soma));
		        
		        int[] produto = produtoVetores(x, y);
		        System.out.println("Produto: " + Arrays.toString(produto));
		        
		        int[] interseccao = interseccaoVetores(x, y);
		        System.out.println("Intersecção: " + Arrays.toString(interseccao));
		    }
		    
		    public static int[] uniaoVetores(int[] x, int[] y) {
		        int[] uniao = new int[x.length + y.length];
		        int idx = 0;
		        
		        for (int valor : x) {
		            uniao[idx++] = valor;
		        }
		        
		        for (int valor : y) {
		            if (!contem(uniao, valor)) {
		                uniao[idx++] = valor;
		            }
		        }
		        
		        return Arrays.copyOf(uniao, idx);
		    }
		    
		    public static int[] diferencaVetores(int[] x, int[] y) {
		        int[] diferenca = new int[x.length];
		        int idx = 0;
		        
		        for (int valor : x) {
		            if (!contem(y, valor)) {
		                diferenca[idx++] = valor;
		            }
		        }
		        
		        return Arrays.copyOf(diferenca, idx);
		    }
		    
		    public static int[] somaVetores(int[] x, int[] y) {
		        int[] soma = new int[x.length];
		        
		        for (int i = 0; i < x.length; i++) {
		            soma[i] = x[i] + y[i];
		        }
		        
		        return soma;
		    }
		    
		    public static int[] produtoVetores(int[] x, int[] y) {
		        int[] produto = new int[x.length];
		        
		        for (int i = 0; i < x.length; i++) {
		            produto[i] = x[i] * y[i];
		        }
		        
		        return produto;
		    }
		    
		    public static int[] interseccaoVetores(int[] x, int[] y) {
		        int[] interseccao = new int[x.length];
		        int idx = 0;
		        
		        for (int valor : x) {
		            if (contem(y, valor)) {
		                interseccao[idx++] = valor;
		            }
		        }
		        
		        return Arrays.copyOf(interseccao, idx);
		    }
		    
		    public static boolean contem(int[] vetor, int valor) {
		        for (int elem : vetor) {
		            if (elem == valor) {
		                return true;
		            }
		        }
		        return false;
		    }
	}


