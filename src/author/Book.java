package author;

import java.util.Objects;

public class Book {

    private String serialId;
    private String title;
    private String discription;
    private double price;
    private int count;
    private Author author;

    public Book(String title,String serialId, String discription, double price, int count, Author author) {
        this.serialId = serialId;
        this.title = title;
        this.discription = discription;
        this.price = price;
        this.count = count;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }



    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && Objects.equals(serialId, book.serialId) && Objects.equals(title, book.title) && Objects.equals(discription, book.discription) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialId, title, discription, price, count, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", serialId='" + serialId + '\'' +
                ", discription='" + discription + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", author=" + author +
                '}';
    }
}
