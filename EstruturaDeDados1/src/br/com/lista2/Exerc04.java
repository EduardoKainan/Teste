package br.com.lista2;

public class Exerc04 {
	
	
	
	public double media(double nota1, double nota2) {
		
		double media  = (nota1 + nota2)/2;
		if(media > 6) {
			System.out.println("Parabens voc� foi aprovado - NOTA:" + media);
		
		}else {
			System.out.println("Infelismente voc� n�o foi aprovado - NOTA" +media);
		}
		return media;
	}

}
