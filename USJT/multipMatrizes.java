@SuppressWarnings("unused")

public class multipMatrizes {
    public static void main(String[] args) {

    	int[][] matriz1 = {{1, 1, 1, 1}, 
    					   {2, 2, 2, 2},
    					   {3, 3, 3, 3},
    					   {4, 4, 4, 4}
    					   };
    	int[][] matriz2 = {{1, 2, 3, 4},
    					   {1, 2, 3, 4},
    					   {1, 2, 3, 4},
    					   {1, 2, 3, 4}
    					   };
    	
    	int[][] resultado = produtoMatriz(matriz1, matriz2);
    	mostrarResultado(resultado);
    	
    }
    
   public static int[][] produtoMatriz(int[][] matriz1, int[][] matriz2){
	   
	   int linhas1 = matriz1.length;
	   int colunas1 = matriz1.length;
	   int colunas2 = matriz2.length;
	   
	   int[][] resultado = new int[linhas1][colunas2];
	   
	   for (int i = 0; i < linhas1; i++) {
		   for (int j = 0; j < colunas2; j++) {
			   for (int k = 0; k < colunas1; k++) {
				   resultado[i][j] += matriz1[i][k] * matriz2[k][j];
			   }
		   }
	   }
	   
	return resultado;
	   
   }
   
   public static void mostrarResultado(int[][] matriz) {
	   for (int i = 0; i < matriz.length; i++) {
		   for (int j = 0; j < matriz.length; j++) {
			   System.out.print(matriz[i][j] + " ");			   
		   }
		   System.out.println();
	   }
	   
   }
}

    

