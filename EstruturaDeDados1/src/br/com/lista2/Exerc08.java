package br.com.lista2;

import java.util.Scanner;

public class Exerc08 {
	
	String caractere = "S";
	double n1;
	double res;
	
	Scanner in = new Scanner (System.in);
	
	public String verificaCaractere(String caractere2) {
		
		System.out.println("Digite um caractere:");
		this.caractere = in.nextLine();
		
		
		 switch (caractere) {
		 
		 	case "S": 
		 		System.out.println("Caractere digitado" + caractere);
		 		break;
		 	case "N": 
		 		System.out.println("Caractere digitado" + caractere);
		 		break;
		 	default: 
		 		System.out.println("Caractere Invalido. Digite: N ou S ");
		 		break;
		 		
		 }
		 
		 return caractere;

	}
		 
	
	
	public double aoCubo(double n2 ) {
	
		
		System.out.println("Deseja continuar? S-SIM OU n-Não: ");
		caractere = in.nextLine();		
				
		while(caractere == "S") {
		
			System.out.println("Digite um numero:");
			n2 = in.nextDouble();
		
			res = n2*n2*n2;
		
			System.out.println("Valor ao cubo:" + res );
		
			
		
		} 
		
		
		
	return res;	
		
	}
		
}
