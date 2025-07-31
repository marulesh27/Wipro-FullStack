package Day6;

import java.util.Scanner;

public class SimpleEncodedArray {

    public static int output1; 
    public static int output2; 
    public static void findOriginalFirstAndSum(int[] input1, int input2) {
        int[] original = new int[input2];
        original[input2 - 1] = input1[input2 - 1];
        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = original[i + 1] - input1[i];
        }

        output1 = original[0];
        output2 = 0;
        for (int num : original) {
            output2 += num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the encoded array: ");
        int n = scanner.nextInt();
        int[] encoded = new int[n];
        System.out.println("Enter the encoded array elements:");
        for (int i = 0; i < n; i++) {
            encoded[i] = scanner.nextInt();
        }
        
        findOriginalFirstAndSum(encoded, n);
        System.out.println("First element in original array: " + output1);
        System.out.println("Sum of original array: " + output2);
        scanner.close();
    }
}
