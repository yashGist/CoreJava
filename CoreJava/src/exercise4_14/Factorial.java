package exercise4_14;

public class Factorial {

	public static void main(String[] args) {

		int a = 5;
		int factorial = 1;
		for (int i = a; i >= 1; i--) {
			factorial = i * factorial;
		}
		System.out.println(factorial);
	}

}
