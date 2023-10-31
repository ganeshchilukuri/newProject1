package newproject;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
        try {
            // Some code that may throw exceptions
            int[] numbers = {4, 2, 3};
            System.out.println(numbers[4]); // Trying to access an out-of-bounds index
            int result = 10 / 0; // Trying to divide by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic exception: " + e.getMessage());
        }

        System.out.println("Program continues after the exception handling.");
    }
}

