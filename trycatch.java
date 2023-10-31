package newproject;

public class trycatch {
	public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 10 / 1;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Division by zero is not allowed");
        } finally {
            // Code that is always executed, regardless of whether an exception occurs
            System.out.println("The try-catch block has finished executing.");
        }
    }

}
