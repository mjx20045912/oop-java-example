package book;

public class BookOrderItem {
    private Book book;
    private int count;

    public BookOrderItem(Book book, int count) {
        this.book = book;
        this.count = count;
    }

    public Book getBook() {
        return book;
    }

    public int getCount() {
        return count;
    }
}
