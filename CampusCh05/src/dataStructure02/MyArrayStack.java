package dataStructure02;

import dataStructure.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack; //멤버변수 자동으로 이니셜라이저된다(초기화), 객체인경우 null
	int top; //개수
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		
		if(isFull() ) {
			System.out.println("Stack is full");
			return;  
		}
		arrayStack.addElement(data);
		top++;
		
	}
	public int pop() {
		
		if(isEmpty() ) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		
		if(isEmpty() ) {
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	
	public boolean isFull() {
		
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		return false;
		
	}
	public boolean isEmpty() {
		
		if(top ==0) {
			System.out.println("Stack is empty");
			return true;
		}
		else return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}

}
