package USJT;

import java.util.Scanner;

public class imparEpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[6];
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.print("Os numeros pares são: ");
        for (int i = 0; i < 6; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                somaPares += vetor[i];
            }
        }
        System.out.println("\nSoma dos números pares:" + somaPares);

        System.out.print("Números ímpares: ");
        for (int i = 0; i < 6; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
                somaImpares += vetor[i];
            }
        }
        System.out.println("\nSoma dos números ímpares:" + somaImpares);
        entrada.close();
    }
}
