package com.br.lista1;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

			int pos[] = new int [40];
			
			Scanner in = new Scanner(System.in);
			
			for (int i = 0; i < 40; i++) {
				System.out.println("Insira um numero:");
				pos[i] = in.nextInt();
				
					if (pos[i] < 0) {
						
						pos[i] = 0;
						
						System.out.println();
					}
				System.out.println("O Valor é " +pos[i]);
			}
			
			
			
			
	}

}
