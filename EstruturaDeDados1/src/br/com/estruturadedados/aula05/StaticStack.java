package br.com.estruturadedados.aula05;

public class StaticStack {
	

	
	int top;
	int[] stack;
	int max;
	
	public void create (int size) {
		this.top = -1;
		this.stack = new int[size];
		this.max = size -1;
	}
	
	public boolean isEmpty() {
		
		return this.top == -1;
	}
	
	public boolean isFull() {
		
		return this.max == this.top;
	}
	
	public void printAll() {
		
		for (int cont = this.top; cont > -1; cont -- ) {
			
			System.out.println("Stack [" +cont+"] = " + this.stack  );
			
		}
	}
	
	public void push (int element) {
		
		if (isFull()) {
			
			System.out.println("Pilha cheia");
		}
		
		this.top = this.top + 1;
		
		this.stack [this.top] = element;
	}
	
	public int pop() {
		
		if (isEmpty());
		
		System.out.println("Pilha vazia");
		
		return -1;
		
	}
	
	int aux = this.stack[this.top];
	this.top--;
	
	return aux;
	
	}
	
	
}





