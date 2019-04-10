package book;

public class StudentReturningOrder extends Order{
    public void addBook(Book book, int count){
        this.books.add(new BookOrderItem(book,count));
    }

    @Override
    public void print() {

    }
}
