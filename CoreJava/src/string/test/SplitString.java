package string.test;

public class SplitString {

	public static void main(String[] args) {

		String s = "Vijay Dinanath Chouhan";

		String ss[] = s.split(" ");

		for (String string : ss) {
			System.out.println(string);
		}
	}

}
