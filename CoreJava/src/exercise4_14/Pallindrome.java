package exercise4_14;

public class Pallindrome {

	public static void main(String[] args) {

		String s = "12121";
		char[] ch = s.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		if (s.equals(rev)) {
			System.out.println("Pallindrome..");
		} else {
			System.out.println("Not Pallindrome..");
		}
	}
}
