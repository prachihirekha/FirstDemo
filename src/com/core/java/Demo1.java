package com.core.java;





class Student{
	int rollNum;// instance member
	String name;
	float fees;
	// parametrized constrctor
	public Student(int rollNum, String name, float fees) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.fees = fees;
	}
	void display() {
		System.out.println(rollNum+" " +name+" "+fees);
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sp = new Student(1,"Prachi",4456.4f);
		Student sp1 = new Student(2,"Prajwal",443456.4f);
           sp.display();//1 step
           sp1.display();
	}

}
