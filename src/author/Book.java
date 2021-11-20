package author;

public class Book {

    private String title;
    private String discription;
    private  double price;
    private int count;

    public Book(String title, String discription, double price, int count) {
        this.title = title;
        this.discription = discription;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", discription='" + discription + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
