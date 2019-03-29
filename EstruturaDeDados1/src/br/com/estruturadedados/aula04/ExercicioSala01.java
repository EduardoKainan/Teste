package br.com.estruturadedados.aula04;

import java.util.Scanner;

public class ExercicioSala01 {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			int a[][], i, j, maior=0;
			a = new int [5] [2];
			for(i = 0; i<5; i++) {
				for (j=0; j<2; j++) {
					System.out.println("Informe um numero");
					a[i][j] = in.nextInt();
				}
			}
			for(i = 0; i < 5; i++ ) {
				for (j =0; j<2; j++) {
					if (i == 0 && j == 0) {
						maior = a[i][j];
					}
					if(a[i][j] > maior ) {
						maior = a[i][j];
						
					}
				}
			}
			
			System.out.println("O maior numero é:" +maior);

	}
	
}
