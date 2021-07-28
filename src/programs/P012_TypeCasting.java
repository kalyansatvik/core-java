package programs;

public class P012_TypeCasting {

	public static void main(String[] args) {
		// automatic: byte -> short -> char -> int -> long -> float -> double
		// manual: double -> float -> long -> int -> char -> short -> byte
		short myShort = 10;
		int myInt0 = myShort;
		System.out.println(myInt0);

		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1; // Manual casting: double to int

		System.out.println(myDouble1); // Outputs 9.78
		System.out.println(myInt1); // Outputs 9
		
		String myString = "9";
		int typeStr = Integer.parseInt(myString);
		System.out.println(myString);
		System.out.println(typeStr);
		
		double typedbl = Double.parseDouble(myString);

	}

}
