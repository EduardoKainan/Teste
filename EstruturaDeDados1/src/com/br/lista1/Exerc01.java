package com.br.lista1;

public class Exerc01 {
	
	double n1;
    double n2;
	double res;
	public double divisao (double n1, double n2) {
		if ( n2 != 0) {
			this.res = n1/n2;
			System.out.println(res); 
		}else{ 
			System.out.println("Denomindador menor que o numerador");
		};
		
		return res;		
	
	}
}
