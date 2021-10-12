package exercise4_14;

public class SumOfAllIntegers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 200; i++) {
			if (i >= 100 && i % 7 == 0) {
				System.out.print(i + " ");
				sum = i + sum;
			}

		}

		System.out.println();
		System.out.println();
		System.out.println("Sum of all Numbers between 100 to 200 and divisible by 7 is--" + sum);
	}
}
