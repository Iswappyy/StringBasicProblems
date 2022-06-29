package com.demoexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevString {
	public static void main(String[] args) {
		String s1 = "1,2,3,4,swapnil,5,6,ram,7,8";

		String[] s2 = s1.split(",");

		//String s3 = "";
		List<String> list = new ArrayList();
		for (int i = 0; i <= s2.length - 1; i++) {
			if (s2[i].length() > 1)
				// System.out.println(s2[i]);
				//s3 = s2[i];
				list.add(s2[i]);
			// System.out.println(s3);
		}
		// System.out.println(s3);
		//System.out.println(list);
		String l1=list.toString();
//		//String s3 = s2[4].toString();
//		//System.out.println(s3);
		StringBuffer sb = new StringBuffer(l1);
		sb.reverse();
		String ss1 = new String(sb);
		System.out.println(ss1);
//		String ss2 = s1.replace(l1, ss1);
//		System.out.println(ss2);

	}

}
