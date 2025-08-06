package Day8;

import java.util.HashMap;
import java.util.Scanner;

public class LargestPalindrome {

    public static int charactersToRemove(String input1) {
        input1 = input1.toLowerCase();
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : input1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount == 0 || oddCount == 1) {
            return 0; 
        }

        if (oddCount == input1.length()) {
            return -1; 
        }

        return oddCount - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        int result = charactersToRemove(word);
        System.out.println("Characters to remove: " + result);
    }
}

