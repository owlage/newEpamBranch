package book;

public class Books {
    private Book[] books;
    private int size;
    private int capacity;

    public Books(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.books = new Book[capacity];
    }

    public Books() {
        this(10);
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
