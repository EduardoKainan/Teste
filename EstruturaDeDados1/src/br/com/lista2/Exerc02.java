package br.com.lista2;

public class Exerc02 {
		
		public double area(double raio) {
			raio = Math.PI*(raio*raio);
			System.out.println("O raio do circulo �:" + raio);
			return raio;
	}
		public double perimetro(double raio) {
			double perimentro = (Math.PI*2)*raio;
			System.out.println("O perimentro do circulo �:" + perimentro);

			return perimentro;
		}

}
