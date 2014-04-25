package com.riskiq.stacknqueue;

public class Stack<T extends Object> {
	T[] stack;
	private static int MAX_SIZE = 10000;
	private int top;
	
	@SuppressWarnings("unchecked")
	Stack() {
		stack = (T[]) new Object[MAX_SIZE];
		top = -1;
	}
	public boolean isEmpty(){
		return top == -1;
	}
	
	public T peek() {
		if(isEmpty()) return null;
		return stack[top];
	}
	
	public T push (T item){
		stack[++top] =  item;
		return item;
	}
	
	public T pop() {
		if(isEmpty()) return null;
		T item = stack[top--];
		return item;
	}
}
