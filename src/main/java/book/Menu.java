package book;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome book system");
        Manager.initBookStorage();
        Student student = new Student("2001", "mjx", "13000000");
        Map<Book, Integer> books = new HashMap<>();
        books.put(new Book("001", "Math"), 5);

        student.borrowBooks(books);

        student.returningOrder(books);
    }
}
