package com.intern.java;

public class DemoString {
	public static void main(String[] args) {
		String s1 = "Swap";
		String s2 = "Swap";
		String s3 = new String ("Swap");
		String s4 = new String ("Swap");
		
  		System.out.println(s1 == s2);       //True.. 
		//System.out.println(s2);
		System.out.println(s3 == s4);       //False..
		System.out.println("Hashcode of s1: "+ s1.hashCode() + " " + "Hashcode of s2: "+ s2.hashCode());
		System.out.println("Hashcode of s3: "+ s3.hashCode() + " " + "Hashcode of s4: "+ s4.hashCode());
	}
	

}
