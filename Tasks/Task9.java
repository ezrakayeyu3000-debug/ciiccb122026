import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);         // static import used!
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);    // static import used!
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);    // static import used!
    }

    public static float divide(int a, int b) {
        return (float) a / b;          // regular division for decimal precision
    }

    public static void main(String[] args) {
        System.out.println("Math Operations Demo");
        System.out.println("====================");

        int x = 10, y = 5;

        System.out.println("Add:       " + add(x, y));
        System.out.println("Subtract:  " + subtract(x, y));
        System.out.println("Multiply:  " + multiply(x, y));
        System.out.println("Divide:    " + divide(x, y));

        System.out.println("\nUsing floorDiv directly:");
        System.out.println("floorDiv(10, 3) = " + floorDiv(10, 3));
        System.out.println("floorDiv(-10, 3) = " + floorDiv(-10, 3));
    }
}