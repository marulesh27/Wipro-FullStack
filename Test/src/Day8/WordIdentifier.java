package Day8;

import java.util.Scanner;

public class WordIdentifier {

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase();
        String[] wordList = input2.toLowerCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String word : wordList) {
            word = word.trim();
            if (word.length() != input1.length()) continue;

            boolean match = true;
            for (int i = 0; i < word.length(); i++) {
                char ch1 = input1.charAt(i);
                char ch2 = word.charAt(i);
                if (ch1 != '_' && ch1 != ch2) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0) result.append(" ");
                result.append(word.toUpperCase());
            }
        }

        return result.length() > 0 ? result.toString() : "ERROR-009";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter incomplete word (with _): ");
        String input1 = scanner.nextLine();

        System.out.print("Enter list of words separated by colons (:): ");
        String input2 = scanner.nextLine();

        String output = identifyPossibleWords(input1, input2);
        System.out.println("Possible words: " + output);
    }
}
