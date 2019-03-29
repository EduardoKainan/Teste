package com.br.lista1;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
				
		int vetA[] = new int[9];
		int verB[] = new int[9];
		int verC[] = new int[9];
		int num=0;
		
		Scanner in = new Scanner (System.in);
		
		for(int cont1 = 31; cont1 < 39; cont1++) {
			
			System.out.println("Digite os numeros para o primeiro vetor");
			num = in.nextInt();
			
			if(vetA[num] % 2 == 0) {
				vetA[cont1] = num;
				
				System.out.println("O numeros pares do vetorA: " + vetA[cont1]);
				
			}
			
			for(int cont2 = 41; cont2 < 49; cont2++) {
				
				System.out.println("Digite os numeros para o segundo vetor");
				verB[cont2] = in.nextInt();
				
				if(verB[cont2] % 2 != 0) {
					verB[cont2] = num;
					
					System.out.println("O numeros pares do vetorA: " + vetA[cont1]);
			
				}
			}
		}
		
	}
}