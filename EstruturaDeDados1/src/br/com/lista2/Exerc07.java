package br.com.lista2;

import java.util.Scanner;

public class Exerc07 {
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double delta;
	
	Scanner in = new Scanner(System.in);
	
	public void calcCoeficiente() {
		
		System.out.println("Insira o valor de a:");
		this.a = in.nextDouble();
		System.out.println("Insira o valor de b:");
		this.b = in.nextDouble();
		System.out.println("Insira o valor de c:");
		this.c = in.nextDouble();
		
		this.delta = (b*b)-(4*a*c);
		System.out.println(delta);
		
			if(delta > 0) {
				this.x1 = (-b + Math.sqrt(delta)/(2*a));
				this.x2 = ( b + Math.sqrt(delta)/(2*a));
				
				if(x1!=x2) {
					System.out.println("Raizes distintas: 1" + x1 + x2 );
				}

				if(x1!=x2) {
					System.out.println("Raizes iguais: 0" + x1 + x2);
				
				
			}else {
				System.out.println("Não possui raiz real:");
			}
		
		
		
	}
}
}
