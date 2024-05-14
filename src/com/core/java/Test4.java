package com.core.java;

public class Test4 {
	void display() {
		this.show();
		System.out.println("display method me hu");
	}
	void show() {
		System.out.println("show method me hu");
	}

	public static void main(String[] args) {
		Test4 t3= new Test4();
		t3.display();
	}

}
