package Day6;
import java.util.Scanner;

public class PasswordGenerator {
    public static String[] splitWord(String word) {
        int n = word.length();
        int base=n/3;
        int rem=n%3;
        int part1Len = base;
        int part2Len = base+rem;
        //int part3Len = n - (part1Len + part2Len);

        String part1 = word.substring(0, part1Len);
        String part2 = word.substring(part1Len, part1Len + part2Len);
        String part3 = word.substring(part1Len + part2Len);

        return new String[] { part1, part2, part3 };
    }
    public static String formPassword(String word1, String word2) {
        String[] w1 = splitWord(word1);
        String[] w2 = splitWord(word2);
        
        return w2[0] + w1[0] + w1[2] + w2[2];
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word 1: ");
        String word1 = scanner.nextLine().trim();

        System.out.print("Enter word 2: ");
        String word2 = scanner.nextLine().trim();

        String password = formPassword(word1, word2);
        System.out.println("Generated Password: " + password);
        scanner.close();
    }
}

