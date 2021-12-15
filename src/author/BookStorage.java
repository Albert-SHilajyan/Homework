package author;

public class BookStorage {


    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
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
    public Book getBySerialId(String serialId){
        for (int i = 0; i < size; i++) {
            if (books[i].getSerialId().equals(serialId)) {
            return books[i];
            }

        }
return null;
    }

    public void searchByTitle(String keyword1) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword1)) {
                System.out.println(books[i]);
            }

        }
    }

    public void searchByDiscrition(String keyword2) {
        for (int i = 0; i < size; i++) {
            if (books[i].getDiscription().contains(keyword2)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }

        }
    }

    public void countByAuthor(Author author) {
        int count= 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
count ++;
            }
        }
        System.out.println("count of" + author.getEmail()+"author's book is" + count);
    }
}
