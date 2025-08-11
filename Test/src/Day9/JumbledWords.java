import java.util.*;

public class JumbledWords {

    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        if (method == 1) {
            for (int i = 0; i < word.length(); i += 2) {
                odd.append(word.charAt(i));
            }
            for (int i = word.length() - 1; i >= 0; i--) {
                if (i % 2 != 0) {
                    even.append(word.charAt(i));
                }
            }
            return odd.append(even).toString();

        } else if (method == 2) {
            for (int i = 0; i < word.length(); i += 2) {
                odd.append(word.charAt(i));
            }
            for (int i = 1; i < word.length(); i += 2) {
                even.append(word.charAt(i));
            }
            return odd.append(even).toString();
        }
        return word;
    }

    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(jumbleWord(words[i], input2));
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a proper sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter method type (1 or 2):");
        int method = sc.nextInt();
        String jumbledSentence = JumbledWords(sentence, method);
        System.out.println("Jumbled Sentence: " + jumbledSentence);
        sc.close();
    }
}
