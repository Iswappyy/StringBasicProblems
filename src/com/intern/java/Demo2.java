package com.intern.java;

public class Demo2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,4,5,6,3,1};
		
		for(int i=0 ; i< arr.length ; i++) {
			int count = 1;
			for(int j=i+1 ; j < arr.length; j++ ) {
				if(arr[i] == arr[j]) {
					count++;
				}
				
			}
			for(int k = i; k>0 ; k--) {
				if(arr[i] == arr[k-1]) {
					count = 0;
				}
			}
				if(count >= 1) {
					System.out.println(arr[i] + "  " + count);
				}
		}
	} 

}
