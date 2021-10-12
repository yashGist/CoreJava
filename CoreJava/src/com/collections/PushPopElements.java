package com.collections;

import java.util.Stack;

public class PushPopElements {

	public static void main(String[] args) {

		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Stack s1 = new Stack<>();
		s1.push(s);

		Stack s2 = new Stack<>();
		s1.pop();
		s2.pop();

		for (Object stack : s2) {
			System.out.println(stack);

		}

	}

}
