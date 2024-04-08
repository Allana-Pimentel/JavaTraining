import java.util.Scanner;

public class PalindromoReader {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra");
		String palavra = sc1.nextLine();
		String palindromo = "";
		
		for(int i = palavra.length() -1; i >= 0; i--) {
			palindromo += palavra.charAt(i);
		}
		if(palindromo.equals(palavra)) {
			System.out.print("É um palíndromo!" + "\n" + palindromo);
		}
		else {
			System.out.print("Não é um palíndromo!" + "\n" + palindromo);
			
		}
		sc1.close();
	}
		
	}


