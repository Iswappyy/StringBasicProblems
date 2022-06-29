package com.stringmethod.java;

public class StringMethodPart2 {
	public static void main(String[] args) {
		String s1 = new String("B"); //97
		String s2 = new String("BA"); //65
		
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		  
		
//		String s3 = "Swapnil";
//		String s4 = "Ajay";
//		String s5 = "Raj";
//		
//		System.out.println(String.join(" ",s3,s4,s5 ));
	}

}
