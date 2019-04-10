package book;

public class StudentBorrowingOrder extends Order {

    public StudentBorrowingOrder() {
        super();
    }

    public void addBook(Book book, int count) {
        this.books.add(new StudentBorrowingOrderItem(book, count));
    }

    @Override
    public void print() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
