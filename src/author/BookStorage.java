package author;

public class BookStorage {

    private Book[] books = new Book[23];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;


    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];

        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
    }
    public void searchByTitle(String keyword1) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword1) ) {
                System.out.println(books[i]);
            }

        }
    }
}
