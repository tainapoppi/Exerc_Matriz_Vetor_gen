package exercVetorMatriz.gen;

import java.util.Scanner;

public class Exerc_Vetor_1 {

	public static void main(String[] args) {
		  Scanner leia = new Scanner(System.in);

	      
	        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        
	        System.out.println("0  1  2  3  4  5  6  7  8  9");
	        System.out.print("vetor\n");
	        for (int num : vetor) {
	            System.out.print(num + "  ");
	        }
	        System.out.println("\n");

	     
	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numero = leia.nextInt();

	     
	        int posicao = -1;
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                posicao = i;
	                break;
	            }
	        }

	     
	        if (posicao != -1) {
	            System.out.println("O número " + numero + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número não foi encontrado!");

	}

}
	
}
