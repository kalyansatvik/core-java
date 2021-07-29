package programs;

public class P015_Strings {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.length());

        //concat
        String str1 = "Hello";
        String str2 = "Java";
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        //equals
        String str3 = "sic mundas";
        String str4 = "SIC MUNDAS";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

        //contains
        System.out.println(str3.contains("sic"));
        System.out.println(str3.contains("abc"));

        //substring
        System.out.println(str3.substring(0,4));

        //replace
        System.out.println(str3.replace('s','m'));
        System.out.println(str3.replace("sic","dejavu"));
    }
}
