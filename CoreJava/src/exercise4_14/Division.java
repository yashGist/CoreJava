package exercise4_14;

public class Division {

	int a;

	public Division() {

		System.out.println("hello Constructor!!");
	}

	public Division(int a, String s) {
		System.out.println("hello Constructor!!!!!!!!!!!!!" + a);
	}

	public Division(int a, String s, int d) {
		this(a, s);
		System.out.println("hello Constructor!!" + a);
		
	}

	public static void main(String[] args) {

		Division division = new Division(5, "java", 6);

	}

}
