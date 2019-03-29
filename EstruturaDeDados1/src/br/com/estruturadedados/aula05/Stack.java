package br.com.estruturadedados.aula05;

import java.util.Scanner;

public class Stack {
	
	String formula = new String();
	String[] stack;
	
	Scanner in = new Scanner (System.in);
	
		
	public void verificarParentese( ) {
		
		System.out.println("Insira uma função:");
		formula = in.nextLine();
		stack = new String[formula.length()];
		
		for(int i1 = 0; i1 < stack.length; i1++) {
			
			if(stack[i1] == "(") {
				
			}
		
		System.out.println("Posição e Caractare" + stack[i1]);
		
		
		
		
	}

}
}
