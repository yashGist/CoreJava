package com.array;

public class CopyAnArray {

	public static void main(String[] args) {

		char[] copyFrom = { 'a', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		System.out.println(copyTo);

	}

}
