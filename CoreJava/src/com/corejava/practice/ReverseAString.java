package com.corejava.practice;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "java";
		String rev="";
		char[] ch = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);
	}

}
