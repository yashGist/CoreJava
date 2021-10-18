package exercise4_14;

public class AverageConsecutive {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
				countEven++;
			} else {
				sumOdd = sumOdd + i;
				countOdd++;
			}
		}
		System.out.println("Average Even consecutive-- " + sumEven / countEven);
		System.out.println("Average Odd consecutive-- " + sumOdd / countOdd);

	}
}
