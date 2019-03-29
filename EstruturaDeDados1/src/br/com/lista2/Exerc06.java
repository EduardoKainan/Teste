package br.com.lista2;

import java.util.Scanner;

public class Exerc06 {
	
	int lado;
	double tam_Lado;
	
	Scanner in = new Scanner (System.in);
	
	
	public double calcArea(double lado) {
		
		return lado * lado;
			
	}
	
	public double calcPerimetro(double tam_Lado) {
		return 3*lado;
	}
	

}
