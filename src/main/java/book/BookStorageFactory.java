package book;

public class BookStorageFactory {
    private static BookStore bookStore;

    public static BookStore getBookStorage(){
        return bookStore == null? new BookStore(): bookStore;
    }
}
