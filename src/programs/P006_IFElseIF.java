package programs;

public class P006_IFElseIF {

	public static void main(String[] args) {
//		int a = 50, b = 12, c=43;
//		if(a>b && a>c) {
//			System.out.println(a);
//		}else if(b>c) {
//			System.out.println(b);
//		}else {
//			System.out.println(c);
//		}
		
//		if(a>b && a>c) {
//			System.out.println(a);
//		}else {
//			System.out.println("a is not Highest number");
//		}
		
		//job eligibilty age>25 and gender = male -- mechanical engineer post, age>25 or gender= female -- office assistant
		int age = 50; String gender = "female";
		
//		if(age>25) {
//			if(gender.equals("male")) {
//				System.out.println("Eligible for Mechanical Engg");
//			}else {
//				System.out.println("Eligible for Office Assistant");
//			}
//		}else {
//			System.out.println("Not eligible");
//		}
		
		if(age<=25) {
			System.out.println("Not eligible");		
		}else {
			if(gender.equals("male")) {
				System.out.println("Eligible for Mechanical Engg");
			}else {
				System.out.println("Eligible for Office Assistant");
			}
		}
		System.out.println("Thanks for Applying job");
	}

}
