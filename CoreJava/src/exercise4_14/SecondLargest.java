package exercise4_14;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 4, 55, 2, 98, 67, 44, 78, 555, 708, 99, 100 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}

}
