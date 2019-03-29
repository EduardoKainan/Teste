package com.br.lista1;

import java.util.Scanner;

public class Exerc3b {
	
	public static void main (String[] args) {
		
		
		int num;
		double media;
		
		
	Scanner entrada = new Scanner(System.in);
		int cont = 0;
		int  soma = 0;
	System.out.println("Digite um numero inteiro:");
	num = entrada.nextInt();
	
	do  {
		cont =+ 1;
		soma =+ num;
		System.out.println("Digite um numero inteiro:");
		num = entrada.nextInt();
		
	} while (num != 0);
		media = soma/cont;
		
		System.out.println("A media é:" + media);
	
	
		
		}
	
	}


