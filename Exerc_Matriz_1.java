package exercVetorMatriz.gen;

import java.util.Scanner;

public class Exerc_Matriz_1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	       
	        double[][] notas = new double[10][4];
	        double[] medias = new double[10]; 

	      
	        System.out.println("Digite as notas dos alunos para os 4 bimestres:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Aluno " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                notas[i][j] = leia.nextDouble();
	            }
	        }

	        
	        for (int i = 0; i < 10; i++) {
	            double soma = 0;
	            for (int j = 0; j < 4; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / 4;
	        }

	     
	        System.out.println("\nMédias dos alunos:");
	        for (int i = 0; i < 10; i++); {	       
	        System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
	                                                            
	       
	        
	 }
	    }
	}

	
