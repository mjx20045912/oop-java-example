package book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<String,BookStoreItem> bookStorage;

    protected BookStore() {
        this.bookStorage = new HashMap<>();
    }

    public void push(Book book, int count){
        if(bookStorage.containsKey(book.getNumber())){
            bookStorage.get(book.getNumber()).increaseCount(count);
        }else {
            bookStorage.put(book.getNumber(),new BookStoreItem(book,count));
        }
    }

    public void pop(Book book, int count) throws Exception {
        if(!bookStorage.containsKey(book.getNumber())) {
         throw new Exception("no storage for book:"+ book.getName());
        }
        bookStorage.get(book.getNumber()).decreaseCount(count);
    }
}
