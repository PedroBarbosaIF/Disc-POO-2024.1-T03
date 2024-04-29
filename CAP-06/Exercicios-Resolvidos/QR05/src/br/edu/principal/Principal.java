package br.edu.principal;
import java.util.Arrays;
public class Principal {

	public static void main(String[] args) {
		

		
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


