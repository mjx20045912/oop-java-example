package book;

public class Book {
    private String number;
    private String name;
    private String comment;

    public Book(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Book(String number, String name, String comment) {
        this(number,name);
        this.comment = comment;
    }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }
}
