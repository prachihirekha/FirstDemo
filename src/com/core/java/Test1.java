package com.core.java;
// this.= data member
// this()= to invoked constructor
public class Test1 {
	 int a; 
	 int b;
   Test1(){
	 //  this(0);
	   this(10,20);// this key word used for witout creatindg a object
	   System.out.println("i am in a default constructor");
   }
   Test1(int a, int b){
	   this.a=a;
	   this.b=b;
	   System.out.println("I am in parameterized constructor");
   }
   Test1(int a){
	   System.out.println("im in int constructor");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test1 t1 = new Test1();
     //  Test1 t2 = new Test1(0,0);
       
       
	}

}
