package programs.Arrays;

import java.util.Scanner;

public class FindRepeatedValuesInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int userInput = sc.nextInt();
		
		int arr[] = new int[5];
		
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		arr[0] = number1;
		
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();
		arr[1] = number2;
		
		
		System.out.println("Enter number3: ");
		int number3 = sc.nextInt();
		arr[2] = number3;
		
		System.out.println("Enter number4: ");
		int number4 = sc.nextInt();
		arr[3] = number4;
		
		System.out.println("Enter number5: ");
		int number5 = sc.nextInt();
		arr[4] = number5;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
