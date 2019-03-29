package br.com.lista2;

public class Calculadora{
	
	private int n1;
	private int n2;
	private int res = 0;
	
	public void insertNuber(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void somar (int n1, int n2) {
		
		this.res = n1 + n2;
		
		System.out.println("O resultado da soma" + res);
		
	}
	
	public void subtrair (int n1, int n2) {
		
		this.res = n1 - n2;
		
		System.out.println("O resultado da subtração" + res);

}
	public void multiplicacao(int n1, int n2) {
		
		this.res = n1 * n2;
		
		System.out.println("O resultado da multiplicação" + res);
}
	public void dividir(int n1, int n2) {
		try {
			this.res = n1 / n2;
			System.out.println("O resultado da divisão:" + res);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	
}
}
