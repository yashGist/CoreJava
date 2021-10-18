package exercise4_14;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 3;
		switch (num) {
		case 1:
			System.out.println("This is a Prime Number");
			break;
		case 2:
			System.out.println("This is a Prime Number");
			break;
		case 3:
			System.out.println("This is a Prime Number");
			break;
		default:
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.println("This is a Not Prime Number");
			} else {
				System.out.println("This is a Prime Number");
			}
			break;
		}
	}

}
