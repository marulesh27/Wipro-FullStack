package Day7;
import java.util.*;

public class SumeetSum {
    public static int getSmallestTwoDigit(int num) {
        String s = String.valueOf(num);
        int min = 99;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    int d1 = s.charAt(i) - '0';
                    int d2 = s.charAt(j) - '0';
                    int candidate = d1 * 10 + d2;
                    if (candidate < min) {
                        min = candidate;
                    }
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        int[] inputs = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            inputs[i] = sc.nextInt();
            int smallest = getSmallestTwoDigit(inputs[i]);
            totalSum += smallest;
        }

        System.out.println("Sumeet Sum: " + totalSum);
        sc.close();
    }
}

