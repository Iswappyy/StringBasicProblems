package com.stringmethod.java;

public class StringMethodPart1 {
	public static void main(String[] args) {
		String s1 = new String("Rajgopalchari");
		
		int s2=s1.length();
		System.out.println("Length of string is :"+ s2);
		
		String s3 = new String("");
		boolean b = s3.isEmpty();
		if(b) {
           System.out.println("Empty method String is empty...!");			
		}
		else {
			System.out.println("Empty method String is not empty...!");
		}
		
		
		String s4 = new String("  swapnil Dipak Thawkar  ");
		
		System.out.println("The trim value of string is :"+ s4.trim());
		System.out.println("The trim length value of string is :"+ s4.trim().length());
		
		String s5 = "Swapnil";
		String s6 ="SWAPNIL";
		System.out.println(s5.equalsIgnoreCase(s6));
	}   

}
