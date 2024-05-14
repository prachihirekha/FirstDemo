package com.core.java;

public class Test2 {
	int a; 
	int b;
	// default constrctor
	Test2(){
		a=10;
		b=20;
	}
	// reference return type
	Test2 get() {
		return this;// return the current class instance
	}
	void display() {
		System.out.println("a ="+a+" "+"b ="+b);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();// object
		//Test2 t2;// reference
		// new Test2();// instance
		t2.get().display();
		//t2.display();
		System.out.println(t2);// hash code
	}

}
