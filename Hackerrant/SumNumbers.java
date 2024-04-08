package Hackerrant;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        int sc3 = sc.nextInt();

         int[] ar = {sc1, sc2, sc3};
            int sum = 0;

                for(int i = 0; i < ar.length; i++)
                {
                    sum += ar[i];
                }
    System.out.println("Soma de todos os elementos no vetor: " + sum);

    }
}
