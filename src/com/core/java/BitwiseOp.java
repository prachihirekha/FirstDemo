package com.core.java;
//& | ^

public class BitwiseOp {

	public static void main(String[] args) {
		int m =60;
		 int n =13;
		 System.out.println(m&n);
		 System.out.println(m|n);
		 System.out.println(m^n);
		System.out.println(m<<2);
		System.out.println(m>>2);
	// 128, 64,32,16,8,4,2,1
          //0,0,1,1,1,1,0,0
		 //& 0 0 0 0 1 1 0 1
		 //= 0 0 0 0 1 1 0 1
		 //  0,0,1,1,1,1,0,0
		 //Or
		 //| 0 0 0 0 1 1 0 1
		 //  0 0 1 1 1 1 0 1
		 // nor
		 // 0 0 1 1 1 1 0 0
		 //^
		 // 0 0 0 0 1 1 0 1
		 // 0 0 1 1 0 0 0 1
		 
		 // left shift << shift your digit by one
		 // 0 0 1 1 1 1 0 0
		 // 1 1 1 1 0 0 0 0
		 // 240 m<<2
		 // right shift >> shift your digit by one
		// 0 0 1 1 1 1 0 0
		// 0 0 0 0 1 1 1 1
		// 15
		// ternary operator
		System.out.println((m<n) ? m :n);
	}

}
