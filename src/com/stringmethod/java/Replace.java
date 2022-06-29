package com.stringmethod.java;

public class Replace {
	public static void main(String[] args) {
		String s1 = "My name is khan , name my ...";
		System.out.println(s1.replace("name", "Aim"));
		System.out.println(s1.replaceFirst("name", "Aim"));
		System.out.println(s1.replaceAll("name", "Aim"));
		System.out.println(s1.replace("name(.*)", "Aim"));
	}

}
