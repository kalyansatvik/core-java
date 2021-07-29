package programs;

public class Methods {
    static void myMethod() {
        System.out.println("My method executed");
    }

    static void name(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }

    static int square(int number) {
        return number * number;
    }

    static int sum(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        myMethod();
        name("sic", "mundas");
        square(3);
        System.out.println(square(3));
        float total = sum(4,5);
        System.out.println(total);
        float avg = total/2;
        System.out.println(avg);
    }


}
