package book;

import java.util.Map;

public class Manager {
    private static BookStore bookStore = BookStorageFactory.getBookStorage();
    private static Administrator admin = new Administrator("majianxun");

    public static void initBookStorage() {
        bookStore.push(new Book("001", "Math"), 30);
        bookStore.push(new Book("002", "Chinese"), 30);
        bookStore.push(new Book("003", "English"), 30);
    }

    public static StudentBorrowingOrder borrow(Student student, Map<Book, Integer> books) {
        StudentBorrowingOrder order = new StudentBorrowingOrder();
        order.setStudent(student);
        order.setAdministrator(admin);
        books.forEach((book, count) -> {
            try {
                bookStore.pop(book, count);
                order.addBook(book, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return order;
    }

    public static StudentReturningOrder back(Student student, Map<Book, Integer> books) {
        StudentReturningOrder order = new StudentReturningOrder();
        order.setStudent(student);
        order.setAdministrator(admin);
        books.forEach((book, count) -> {
            try {
                bookStore.push(book, count);
                order.addBook(book, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return order;
    }
}
