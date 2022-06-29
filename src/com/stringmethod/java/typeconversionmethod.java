package com.stringmethod.java;

public class typeconversionmethod {
	public static void main(String[] args) {
		 int num = 100;
		String s1 = String.valueOf(num);
		System.out.println(s1);
		
		String s3 = s1.toString();
		System.out.println(s3);
		String s2 = "Swapnil";
		char[] c = s2.toCharArray();
		System.out.println(c);
	}

}
