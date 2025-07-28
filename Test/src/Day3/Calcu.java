package Day3;
import java.util.Scanner;
public class Calcu {
public static int powerInt(int num1, int num2) {
	return (int) Math.pow(num1, num2);
}
public static double powerDouble(double num1, int num2) {
	return Math.pow(num1, num2);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer (num1): ");
    int intNum1 = sc.nextInt();
    System.out.print("Enter second integer (num2): ");
    int intNum2 = sc.nextInt();
    int resultInt = powerInt(intNum1, intNum2);
    System.out.println(intNum1 + " raised to the power " + intNum2 + " is: " + resultInt);
    System.out.print("Enter a double number (num1): ");
	double doubleNum1 = sc.nextDouble();
	System.out.print("Enter an integer exponent (num2): ");
	int doubleNum2 = sc.nextInt();
    double resultDouble = powerDouble(doubleNum1, doubleNum2);
    System.out.println(doubleNum1 + " raised to the power " + doubleNum2 + " is: " + resultDouble);
    sc.close();
}
}

