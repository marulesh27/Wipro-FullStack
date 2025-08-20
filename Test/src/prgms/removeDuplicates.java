package prgms;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        System.out.println("After removing duplicates: " + result);
        sc.close();
    }
}

