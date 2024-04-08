package USJT;

import java.util.Scanner;

public class subtMatrizes {
    
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        Scanner entradaA = new Scanner(System.in);
        Scanner entradaB = new Scanner(System.in);
        
        for (int contador=0; contador<10; contador++){
            System.out.println("Insira o " + contador + "" + " elemento do vetor A: ");
            vetorA[contador] = entradaA.nextInt();
        }
        
      
        
        for (int contador=0; contador<10; contador++){
            System.out.println("Insira o " + contador + "" + "elemento do vetor B: ");
            vetorB[contador] = entradaB.nextInt();
        }
        
        int[] vetorC = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.printf("\n");
        for (int i=0; i<10; i++) {
            System.out.printf("v[%d] = %2d\n", i, vetorC[i]);
        }
        entradaA.close();
        entradaB.close();
    }
}
