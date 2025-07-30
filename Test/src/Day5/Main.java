package Day5;

public class Main {
public static void main(String[] args) {
   Author author = new Author("qwerty", "qwerty@example.com", 'M');
   Book book = new Book("Learning Java", author, 499.99, 10);
   System.out.println(book.toString());
 }
}

