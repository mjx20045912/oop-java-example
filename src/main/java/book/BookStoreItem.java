package book;

public class BookStoreItem {
    private Book book;
    private int count = 0;

    public BookStoreItem(Book book, int count) {
        this.book = book;
        if (count > 0) {
            this.count = count;
        }
    }

    public void increaseCount(int count){
        this.count += count;
    }

    public void decreaseCount(int count) throws Exception {
        if(this.count < count){
            throw new Exception("no enough book count");
        }
        this.count -= count;
    }
}
