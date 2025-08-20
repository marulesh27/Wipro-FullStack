package prgms;
import java.util.Scanner;
public class vowCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
        sc.close();
    }
}

