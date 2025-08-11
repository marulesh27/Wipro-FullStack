import java.util.*;

public class FixTheFormula {
    public static int fixTheFormula(String input1) {
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch - '0');
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int num = numbers.get(i + 1);
            switch (op) {
                case '+': result += num; break;
                case '-': result -= num; break;
                case '*': result *= num; break;
                case '/': result /= num; break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(fixTheFormula(input));
        sc.close();
    }
}
