package exercise4_14;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 371;
		int rem = 0;
		int result = 0;
		while (num != 0) {
			rem = num % 10;
			result = result + rem * rem * rem;
			num = num / 10;
		}
		System.out.println(result);
	}

}
