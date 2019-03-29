package com.br.lista1;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		double n1;
		double n2;
		
		Scanner in = new Scanner(System.in);
		
		
			System.out.println("Insira o primeiro valor");
			n1 = in.nextInt();
			System.out.println("Insia o segundo valor");
			n2 = in.nextInt();
			
			if(n1==0 && n2==0) {
				
			System.out.println("Valore são invalidos" + n1 + n2);
		}
			System.out.println("Valores são validos" + n1 + n2);
	}

}
