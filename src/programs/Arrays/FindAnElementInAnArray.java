package programs.Arrays;

public class FindAnElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 4, 5 };
		int inputElement = 4;
		for(int i:arr) {
			if(i==inputElement) {
				System.out.println("Given Element "+inputElement+" is present in the array");
				return;
			}
		}
		System.out.println("Given Element "+inputElement+" is not present in the array");
	}
}
