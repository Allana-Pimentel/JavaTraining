package Hackerrant;

import java.util.Scanner;

public class ScannerSimples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        // Consumir a quebra de linha deixada pelo nextDouble()
        scan.nextLine();

        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
