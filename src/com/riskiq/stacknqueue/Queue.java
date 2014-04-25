package com.riskiq.stacknqueue;

public class Queue<T> {
	T[] queue;
	private static int MAX_SIZE = 10000;
	private int first;
	private int last;
	private int occupancy = 0;
	
	@SuppressWarnings("unchecked")
	Queue() {
		queue = (T[]) new Object[MAX_SIZE];
		first = -1;
		last = -1;
	}
	public boolean isEmpty(){
		return occupancy == 0;
	}
	
	public boolean isFull(){
		return occupancy == MAX_SIZE;
	}
	public T element() {
		if(isEmpty()) return null;
		return queue[first];
	}
	
	public T enqueue (T item){
		if(isFull()) return null;
		queue[++last] =  item;
		occupancy++;
		if(last == MAX_SIZE ) last = 0;
		return item;
	}
	
	public T dequeue() {
		if(isEmpty()) return null;
		T item = queue[first++];
		occupancy--;
		if(first == MAX_SIZE) first = 0;
		return item;
	}
}
