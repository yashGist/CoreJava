package exercise4_14;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		TwoDimensionalArray.tableDynamic();
	}

	public static void tableHardCode() {
		int a[][] = new int[1][10];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 6;
		a[0][3] = 8;
		a[0][4] = 10;
		a[0][5] = 12;
		a[0][6] = 14;
		a[0][7] = 16;
		a[0][8] = 18;
		a[0][9] = 20;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + a[i][j]);
			}
			System.out.println();
		}
	}

	public static void tableDynamic() {
		int a[][] = new int[1][10];
		int table = 4;
		int t;
		for (int i = 0; i < 1; i++) {
			for (int j = 1; j < 10; j++) {
				t = table * j;
				a[i][j] = t;
			}
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + a[i][j]);

			}
			System.out.println();
		}
	}
}
