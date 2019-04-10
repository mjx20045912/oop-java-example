package book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Order implements Printable{
    private Student student;
    protected List<BookOrderItem> books;
    private Administrator administrator;
    private Date date;

    public Order() {
        this.books = new ArrayList<>();
        this.date = new Date();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<BookOrderItem> getBooks() {
        return books;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public abstract void addBook(Book book, int count);
}
