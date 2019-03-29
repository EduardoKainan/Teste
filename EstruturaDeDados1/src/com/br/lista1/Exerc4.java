package com.br.lista1;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		double n1, n2, n3; 
		double media=0;
		double mediaT;
		int aluno;
		
		Scanner entrada = new Scanner (System.in);
	
			for (int i = 0; i<=5; i++) {
			System.out.println("Insira primeira nota:");
			n1 = entrada.nextDouble();
			System.out.println("Insira segunda nota:");
			n2 = entrada.nextDouble();
			System.out.println("Insira terceira nota:");
			n3 = entrada.nextDouble();
			
			for (aluno = 0; aluno < 50; aluno++ )
				
	
			media = (n1+n2+n3)/3;
							
			mediaT = media/i;
				
			System.out.println("A media dos 5 alunos é: " + mediaT);

			
		}
	
	
	}

}
