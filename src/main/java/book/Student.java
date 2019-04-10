package book;

import java.util.Map;

public class Student {
    private String number;
    private String name;
    private String cellPhone;

    public Student(String number, String name, String cellPhone) {
        this.number = number;
        this.name = name;
        this.cellPhone = cellPhone;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public StudentBorrowingOrder borrowBooks(Map<Book, Integer> books){
        return Manager.borrow(this, books);
    }

    public StudentReturningOrder returningOrder(Map<Book, Integer> books){
        return Manager.back(this, books);
    }
}
