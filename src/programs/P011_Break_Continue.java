package programs;

public class P011_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
