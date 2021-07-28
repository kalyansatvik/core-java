package programs;

import java.util.Scanner;

public class P014_UserInput_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		double a= sc.nextDouble();  
		System.out.print("Enter second number- ");  
		double b= sc.nextDouble();  
		System.out.print("Enter third number- ");  
		double c= sc.nextDouble();  
		int d= (int) (a+b+c);  
		System.out.println("Total= " +d);  
		
		int arr[] = {1,2,3,3,4,4,2,3}; //findout no.of times an element repeated
	}

}
