package book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentReturningOrder {
    private Student student;
    private List<BookOrderItem> books;
    private Administrator administrator;
    private Date date;


    public StudentReturningOrder() {
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

    public void addBook(Book book, int count){
        this.books.add(new BookOrderItem(book,count));
    }
}