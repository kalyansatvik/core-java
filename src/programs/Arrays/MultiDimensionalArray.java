package programs.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5 && j == 5) {
					System.out.printf("* ");
				}
				a[i][j] = j;
				System.out.printf("%2d ", a[i][j]);

//			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
