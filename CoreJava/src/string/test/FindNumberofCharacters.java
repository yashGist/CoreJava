package string.test;

public class FindNumberofCharacters {

	public static void main(String[] args) {

		String s = "Vijay Dinanath Chouahn";

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			if (ch[i] == 'a') {
				System.out.println(i + "  " + ch[i]);
			}
		}

	}

}
