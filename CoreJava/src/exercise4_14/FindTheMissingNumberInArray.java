package exercise4_14;

public class FindTheMissingNumberInArray {

	public static void main(String[] args) {

		int[] a = FindTheMissingNumberInArray.array1();
		int[] b = FindTheMissingNumberInArray.array2();
		for (int i = 0; i < b.length; i++) {

			if (a[i] != b[i]) {
				System.out.println(a[i]);
			}
		}
	}

	public static int[] array1() {
		int temp = 0;
		int[] a = { 2, 5, 3, 99, 65 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		return a;
	}

	public static int[] array2() {
		int[] b = { 2, 5, 99, 3 };
		int temp1 = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					temp1 = b[j];
					b[j] = b[i];
					b[i] = temp1;
				}
			}
		}
		return b;
	}

}
