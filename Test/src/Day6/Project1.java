package Day6;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {

    static ArrayList<String> wordList = new ArrayList<>();
    static ArrayList<Integer> wordCount = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of feedback entries:");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter feedback " + (i + 1) + ":");
            String feedback = scanner.nextLine();
            processFeedback(feedback);
        }

        displayWordFrequencies();
        scanner.close();
    }

    static void processFeedback(String feedback) {
        String[] words = feedback.toLowerCase().split("\\s+");

        String prevWord = "";
        for (String word : words) {
            if (word.equals(prevWord)) {
                continue;
            }
            prevWord = word;

            int index = findWord(word);
            if (index == -1) {
                wordList.add(word);
                wordCount.add(1);
            } else {
                wordCount.set(index, wordCount.get(index) + 1);
            }
        }
    }

    static int findWord(String word) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(word)) {
                return i;
            }
        }
        return -1;
    }

    static void displayWordFrequencies() {
        System.out.println("\nFiltered Word Frequencies:");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i) + " : " + wordCount.get(i));
        }
    }
}
