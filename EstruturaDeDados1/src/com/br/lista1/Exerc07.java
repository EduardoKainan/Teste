package com.br.lista1;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		int vet[] = new int [15];
		int n1 = 0;
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 15; i++) {
			vet[i]= i+2;
			System.out.println("Insira um numero");
			n1 = in.nextInt();
			
			
		}
		
		for (int i = 0; i < 15; i++) {
			if (vet[i] > n1) {
				System.out.println("Os numeros maiores do vetores são" +vet[i]);
			}
			
		}
		
	
	}

}
