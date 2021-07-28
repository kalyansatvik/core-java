package programs.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
//		int numbers[] = new int[5];
//		System.out.println(numbers);
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		
//		numbers[0] = 1;
//		numbers[1] = 2;
//		System.out.println(numbers);
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
		//System.out.println(numbers[5]);
		//numbers[5] = 6;
		
//		int digits[] = {1,2,3,4,5,6,7,8};
//		System.out.println(digits);
//		System.out.println(digits[0]);
//		System.out.println(digits.length);
		
//		for(int i=0;i<digits.length;i++) {
//			System.out.print(digits[i]);
//		}
		
//		for(int i:digits) {
//			if(i==5) {
//				System.out.println(i);
//				break;
//			}
//			//System.out.print(i+" ");
//		}
		
		String fruits[] = new String[5];
		System.out.println(fruits.length);
		int i=1;
		for(String fruit:fruits) {				
			fruit = "Apple "+i;
			System.out.println(fruit);
			i++;
		}
		
	}

}
