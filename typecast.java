package newproject;

public class typecast {
	public static void main(String[] args) {
	// Implicit type casting
    byte b = 10;
    int i = b;
    long l = i;
    float f = l;
    double d = f;

    System.out.println("Implicit type casting:");
    System.out.println("byte to int: " + i);
    System.out.println("int to long: " + l);
    System.out.println("long to float: " + f);
    System.out.println("float to double: " + d);

    // Explicit type casting
    double d2 = 30.5;
    int i2 = (int) d2;

    System.out.println("Explicit type casting:");
    System.out.println("double to int: " + i2);
}
}


