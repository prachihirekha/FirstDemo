package com.core.java;

import java.util.Scanner;

public class ExerciseVowelAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		String input= sc.next().toLowerCase();
		
		
		boolean upperCase =input.charAt(0)>=65 && input.charAt(0)<=90;
		boolean lowerCase =input.charAt(0)>=97 && input.charAt(0)<=122;
		boolean vowel= input.equals("a")|| input.equals("e")|| input.equals("i")|| input.equals("o")|| input.equals("u") ;
     if(input.length() > 1) {
    	 System.out.println("it is not a single character");
    	 
     }else if(!(upperCase || lowerCase)) {
    	 System.out.println("error. not a letter enter uppercase or lowercase");
     }else if(vowel){
    	 System.out.println("yes its a vowels");
     }else {
    	 System.out.println("its a consonsent");
     }
	}

}
