package com.br.lista1;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {

		int vetor[] = new int[8];
		int cont = 0;
		int cont2 = 0;
		double soma=0;
		double soma2=0;
		
		Scanner in = new Scanner(System.in);
		
		for(cont = 0; cont < 8; cont++) {
			System.out.println("Digite os numeros: ");
			vetor[cont] = in.nextInt();
			
			
		}
		System.out.println("Vetor formado");
			for(cont=0; cont < 8; cont++) {
				soma+=vetor[cont];
				System.out.println("somar dos numeros do vetor"+cont+ vetor[cont]);
				
					if(vetor[cont]>30) {
						soma+=vetor[cont];
						cont2++;
					}
					
					System.out.println("Numeros maiores que 30" + soma + soma2);
				
			}
			
			
	}

}
