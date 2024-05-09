package com.core.java;

public class StaticDemo {
	 static int a =0;
	public void display() {// static variable // class variable
		a=a+1;
	System.out.println(a);//4th step
	}

	public static void main(String[] args) {//1step
		// TODO Auto-generated method stub
		StaticDemo s1 =new StaticDemo();// object is created
		s1.display();// 3rd step
		StaticDemo s2 =new StaticDemo();
		s2.display();
		StaticDemo s3 =new StaticDemo();
		s3.display();

	}

}
// all object are stored in the heap memory
// all int short etc are stored in the stack memory
