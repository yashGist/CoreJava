package string.test;

public class ReverseString {

	public void reverse() {

		String str = "JAVA";
		char[] ch = str.toCharArray();
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += ch[i];

		}
		System.out.println(rev);

	}

	public void split() {

		String s = "Vijay Dinanath Chouhan";

		String ss[] = s.split(" ");

		for (String string : ss) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {

	}

}
