package programs;

public class P001_ArithmeticOperators {

	public static void main(String[] args) {
		//arithmetic operators
		int a=30, b=20;
		int sum,sub,mul,mod;
		
		float x=30f, y=20f;
		float div;
		//System.out.println(a+b);
		//System.out.println("Sum: "+(a+b));
		
		sum = a+b;
		System.out.println("Sum: "+sum);
		
		sub = a-b;
		System.out.println("Sub: "+sub);
		
		mul = a*b;
		System.out.println("Mul: "+mul);
		
		div = x/y;
		System.out.println("div: "+div);
		
		mod = a%b;
		System.out.println("mod: "+mod);
	}

}

