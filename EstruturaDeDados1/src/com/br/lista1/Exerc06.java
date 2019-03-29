package com.br.lista1;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

			int i;
			int vetorA[] = new int[10]; 
			int vetorB[] = new int[10];
			double aux = 0;
			
			Scanner in = new Scanner(System.in);
				
				for(i = 0; i < 10; i++) {
					System.out.println("Informe o valor do primeiro vetor:");
					vetorA[i] = in.nextInt();
					System.out.println("Informe o valor do segundo vetor:");
					vetorB[i] = in.nextInt();
					
				}
			
				for(i = 0; i < 10; i++) {
					aux = vetorA[i]*vetorB[i];
					
					System.out.println("O produto escalar é" + aux);
				}
		}

}
