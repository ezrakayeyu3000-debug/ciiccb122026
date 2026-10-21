import static java.lang.Math.*;

public class Task9 {

    // Addition using addExact
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using subtractExact
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using multiplyExact
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using floorDiv
    public static float divide(int a, int b) {
        // floorDiv returns an int, we cast to float to match the return type
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println("--- Math Operations Demo ---");
        
        int x = 10;
        int y = 5;

        System.out.println("Addition:       " + add(x, y));
        System.out.println("Subtraction:    " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division:       " + divide(x, y));
        
        System.out.println("\n--- Testing with different values ---");
        System.out.println("10 / 3 (floorDiv): " + divide(10, 3));
        System.out.println("-10 / 3 (floorDiv): " + divide(-10, 3));
    }
}