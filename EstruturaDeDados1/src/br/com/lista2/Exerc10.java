package br.com.lista2;

import java.util.Scanner;

public class Exerc10 {
	
	double n1;
	double n2;
	double res;
	int oper;
	
	Scanner in = new Scanner (System.in);
	
	public void calculadora() {
		
		
		
		System.out.println("$$$$$$ CALCULADORA $$$$");
		
		System.out.print("Digite o primeiro numero:");
		n1 = in.nextDouble();
		System.out.print("Digite o segundo numero:");
		n2 = in.nextDouble();
		
		System.out.println("SELECIONE A OPEÇÃO");
		
		System.out.println(	"1 - Adição "+
				
							"2 - Subtração "+
	
							"3 - Multiplicação "+
		
							"4 - Divisão "+
		
							"0 - Sair " );
		
		System.out.println("Digite o operador desejado:");
		oper = in.nextInt();
		
		boolean continuar = false;
	
		do {
		
		switch(oper) {
			
			case 1:
					System.out.println(this.res = n1+n2);
					break;
			case 2:
					System.out.println(this.res = n1-n2);
					break;
			case 3:
					System.out.println(this.res = n1*n2);
					break;
			case 4:
					System.out.println(this.res = n1/n2);
					break;
			default:
					if(oper == 0 ) {
						System.out.println("Fechando a calculadora");
				
					}
					
					
					
		}
					
		System.out.println("Caso queira continuar digite (1)");
		oper = in.nextInt();
		continuar = true;
					 
			
			}

		while (!continuar);

		}
		
	
	}
