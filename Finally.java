package newproject;

public class Finally {
	public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Attempt to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            // This block will always be executed
            System.out.println("Inside the finally block");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}


