package br.com.lista2;

public class Exer09 {
	
	int n1, n2, res;
	
	public int somar(int n1, int n2) {
		
		int i = 0;
		int res = 0;
		
		for (i = n1; i <= n2; i++) {
			
			res +=i;
			
		}
		System.out.println("Soma: " +res);

		
		
		return res;
	}

}
