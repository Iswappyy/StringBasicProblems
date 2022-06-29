package com.intern.java;

public class Test {
	    public static void main(String[] args) {
			String s1 = new String("Swapnil");
			String s2 = "Swapnil";
			
			System.out.println(s1 == s2);
			
			s1 = s1.intern();
			System.out.println(s1 == s2);
		}
	}


