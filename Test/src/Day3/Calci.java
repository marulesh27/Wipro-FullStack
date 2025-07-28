package Day3;

import java.util.Scanner;
public class Calci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter: 1:add,2:sub,3:mul,4:div,5:mod,6:exit");
		int c=sc.nextInt();
		if(c==1)
		System.out.println("Addition: " + (a + b));
		else if(c==2)
		System.out.println("Subtraction: " + (a - b));
		else if(c==3)
		System.out.println("Multiplication: " + (a * b));
		else if(c==4)
		System.out.println("Division: "+(a/b));
		else if(c==5)
		System.out.println("Modulus: "+(a%b));
		else
		System.out.println("thank you visit again");
		
		
	}
}

