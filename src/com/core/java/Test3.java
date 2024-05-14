package com.core.java;

public class Test3 {
	int a; 
	int b;
	// default constrctor
	Test3(){
		a=10;
		b=20;
	}
	// reference return type
	void get() {
		display();// return the current class instance
	}
	void display() {
		System.out.println("a ="+a+" "+"b ="+b);
	}

	public static void main(String[] args) {
		Test2 t3 = new Test2();// object
		//Test2 t2;// reference
		// new Test2();// instance
		t3.get();// hash code
	}


}
// primetive type  - int byte long    refernce type - String , Test3

