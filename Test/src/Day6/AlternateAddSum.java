package Day6;

import java.util.Scanner;

public class AlternateAddSum {

    public static int AddSub(int N, int opt) {
        int result = 0;

        if (opt == 1) {
           for (int i = N; i >= 1; i--) {
                if ((N - i) % 2 == 0) {
                    result += i;
                } else {
                    result -= i;
                }
            }
        } else if (opt == 2) {
           for (int i = N; i >= 1; i--) {
                if (i >= N - 1) {
                    result += i;
                } else if ((N - i) % 2 == 0) {
                    result -= i;
                } else {
                    result += i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int N = sc.nextInt();

        if (N < 1 || N > 10000) {
            System.out.println("Invalid input! N must be between 1 and 10000.");
            return;
        }

        System.out.print("Enter option (1 or 2): ");
        int opt = sc.nextInt();

        if (opt != 1 && opt != 2) {
            System.out.println("Invalid option! Must be 1 or 2.");
            return;
        }

        int result = AddSub(N, opt);
        System.out.println("Result: " + result);
        sc.close();
    }
}

