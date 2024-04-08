public class showPositionVector {

	public static void main(String[] parametro) {
		int[] vetor1 = {1,2,3,4,5};
		System.out.println("o tamanho do vetor é 11 + vetor1.length");
		System.out.println("primeiro elemento é na posição 0" + vetor1[0]);
		System.out.println("quarto elemento é na posição 4" + vetor1[4]);
		System.out.println("jose carmino");
		percorrerVetor(vetor1);

	}
	public static void percorrerVetor (int[] vetorn){
		for(int i=0; i < vetorn.length; i++){
			vetorn[i] = i*2;
			System.out.println("vetor[" + i + "] é " + vetorn[i]);
		}
	}
}