package programs.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object arr[] = {10,27.9,"welcome",'G',true};
		
		for(Object i:arr) {
			System.out.println(i);
		}
		
		arr[0] = "first";
		System.out.println(arr[0]);
	}

}
