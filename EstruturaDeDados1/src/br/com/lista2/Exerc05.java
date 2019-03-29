package br.com.lista2;

import java.util.Scanner;




	import java.util.Scanner;

	class Exerc05 {

	    double altura;
	    int sexo;
	    double PI;

	    Scanner in = new Scanner (System.in);

	   public double pesoIdeal(int sexo, double altura) {
		
		   
		 
			   
	        System.out.println("DIGITE 1 [MULHER] 2 [HOMEM]");
	        sexo = in.nextInt();

	        if (sexo == 1) {

	            this.PI = 72.7 * altura - 58;
	            System.out.println("Peso idela para o homem:" +PI);

	        }

	        if (sexo == 2) {

	            this.PI = 62.1 * altura - 44.7;
	            System.out.println("Peso idela para o homem: "+PI);

	         
	        }
	        
		  

	        return PI;
	        
		   
	      

	    }
	}

