package Day5;

import java.util.*;
import java.util.regex.*;

public class CustomerFeedbackAnalyzer {
	static ArrayList<String> feedbackList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Customer Feedback Analyzer ---");
            System.out.println("1. Add Feedback");
            System.out.println("2. View All Feedback");
            System.out.println("3. Clean Feedback Text");
            System.out.println("4. Mask Sensitive Information");
            System.out.println("5. Count Keyword Occurrence");
            System.out.println("6. Feedback Summary Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addFeedback();
                case 2 -> viewFeedback();
                case 3 -> cleanFeedback();
                case 4 -> maskSensitive();
                case 5 -> countKeyword();
                case 6 -> summaryReport();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
    }

    static void addFeedback() {
        System.out.print("Enter your feedback: ");
        String fb = sc.nextLine();
        feedbackList.add(fb);
        System.out.println("Feedback added successfully.");
    }

    static void viewFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (int i = 0; i < feedbackList.size(); i++) {
                System.out.println((i + 1) + ". " + feedbackList.get(i));
            }
        }
    }

    static void cleanFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback to clean.");
            return;
        }
        System.out.println("Cleaned Feedback:");
        for (int i = 0; i < feedbackList.size(); i++) {
            String cleaned = feedbackList.get(i)
                .replaceAll("[^\\w\\s@.]", "") // remove special chars except @ and .
                .trim();
            feedbackList.set(i, cleaned);
            System.out.println((i + 1) + ". " + cleaned);
        }
    }

    static void maskSensitive() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback to mask.");
            return;
        }

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
        Pattern phonePattern = Pattern.compile("\\b\\d{10}\\b");

        System.out.println("Masked Feedback:");
        for (int i = 0; i < feedbackList.size(); i++) {
            String feedback = feedbackList.get(i);
            String masked = emailPattern.matcher(feedback).replaceAll("[EMAIL]");
            masked = phonePattern.matcher(masked).replaceAll("[PHONE]");
            feedbackList.set(i, masked);
            System.out.println((i + 1) + ". " + masked);
        }
    }

    static void countKeyword() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback to search.");
            return;
        }

        System.out.print("Enter keyword to count: ");
        String keyword = sc.nextLine().toLowerCase();
        int count = 0;

        for (String fb : feedbackList) {
            String[] words = fb.toLowerCase().split("\\s+");
            for (String word : words) {
                if (word.equals(keyword)) count++;
            }
        }

        System.out.println("The keyword \"" + keyword + "\" appeared " + count + " time(s).");
    }

    static void summaryReport() {
        int total = feedbackList.size();
        int max = 0, min = Integer.MAX_VALUE, totalWords = 0;

        for (String fb : feedbackList) {
            int words = fb.trim().isEmpty() ? 0 : fb.trim().split("\\s+").length;
            totalWords += words;
            if (words > max) max = words;
            if (words < min) min = words;
        }

        double avg = total == 0 ? 0 : (double) totalWords / total;
        if (total == 0) min = 0;

        System.out.println("Feedback Summary:");
        System.out.println("Total Feedbacks: " + total);
        System.out.println("Average Feedback Length (words): " + String.format("%.2f", avg));
        System.out.println("Maximum Words in a Feedback: " + max);
        System.out.println("Minimum Words in a Feedback: " + min);
    }
}



