package com.br.lista1;

import java.util.Scanner;

public class Exerc3a {
	
	public static  void main(String[] args) {
		
	int num;
	int quadrado;
	
	Scanner entrada = new Scanner(System.in);	
	System.out.println("Digite um numero inteiro:");
	num = entrada.nextInt();
	
	while (num != 0 ) {
		quadrado = (num*num);
		System.out.println("O quadrado de: " + num + " eh: " + quadrado);
		System.out.println("Digite um numero inteiro:");
		num = entrada.nextInt();
		}
	
	}
	

}

