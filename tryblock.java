package newproject;

public class tryblock {
	public static void main(String[] args) {
        try {
            int result = divide(1, 10); // Call a method with parameters inside the try block
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 10) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }

}
