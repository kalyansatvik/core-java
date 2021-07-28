package programs;

public class P010_ForLoop {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			for (int j = 11; j <= 20; j++) {
				if(j==11) {
					System.out.println("If Condition passed");
				}
				System.out.println(j);
			}
			System.out.println(i);
		}
	}

}
