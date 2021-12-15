package author;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Scanner;

public class AuthorBookTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String SEARCH_BOOKS_BY_DISCRIPTION = "6";
    private static final String PRINT_AUTHORS = "7";
    private static final String PRINT_BOOKS = "8";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "9";
    private static final String COUNT_BOOKS_BY_AUTHOR = "10";
    private static final String CHANGE_AUTHORS = "11";
    private static final String CHANGE_BOOK_AUTHOR = "12";
    private static final String DELETE_AUTHOR = "13";
    private static final String DELETE_BOOK = "14";
    private static final String DELETE_BOOK_BY_AUTHOR = "15";


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;

                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                    break;
                case SEARCH_BOOKS_BY_DISCRIPTION:
                    searchByDiscription();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthors();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHORS:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BOOK_BY_AUTHOR:
                    deleteBookByAuthor();
                    break;
                default:
                    System.err.println("Invalid command");
            }

        }


    }

    private static void deleteBook() {
    }

    private static void deleteBookByAuthor() {
    }

    private static void deleteAuthor() {
    }

    private static void changeBookAuthor() {
    }

    private static void changeAuthor() {System.out.println("please coose author's email");
        System.out.println("---------");
        authorStorage.print();
        System.out.println("---------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input auther's name");
            String name = scanner.nextLine();
            System.out.println("please input auther's surname");
            String surname = scanner.nextLine();
            System.out.println("please input auther's gander");
            String gender = scanner.nextLine();
            System.out.println("please input auther's age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setName(name);
            author.setSurname(surname);
            author.setAge(age);
            author.setGender(gender);


        } else {
            System.out.println("author does not exist");
        }

    }

    private static void countBooksByAuthor() {
        System.out.println("please coose author's email");
        System.out.println("---------");
        authorStorage.print();
        System.out.println("---------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.countByAuthor(author);
        } else {
            System.out.println("author does not exist");
        }
    }

    private static void searchBooksByAuthors() {
        System.out.println("please coose author's email");
        System.out.println("---------");
        authorStorage.print();
        System.out.println("---------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchByAuthor(author);
        } else {
            System.err.println("Auther does not exist");
        }

    }


    private static void searchByDiscription() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByDiscrition(keyword);
    }

    private static void searchByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);

    }

    private static void addBook() {
        System.out.println("please coose author's email");
        System.out.println("---------");
        authorStorage.print();
        System.out.println("---------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book title");
            String title = scanner.nextLine();
            System.out.println("please input book's serialId");
            String serialId = scanner.nextLine();
            if (bookStorage.getBySerialId(serialId) == null){
            System.out.println("please input book discription");
            String discription = scanner.nextLine();
            System.out.println("please input book price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input books count");
            int count = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title,serialId, discription, price, count, author);
            bookStorage.add(book);

            System.out.println("thank you,book was addid");}


        } else {
            System.err.println("invalid email! please try again");
            addBook();
        }


    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());


        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input" + EXIT + " for EXIT");
        System.out.println("please input" + ADD_AUTHOR + "for add auther");
        System.out.println("please input" + ADD_BOOK + "for add book");
        System.out.println("please input" + SEARCH_AUTHORS + "for search auther by name");
        System.out.println("please input" + SEARCH_AUTHORS_BY_AGE + "for search auther by age");
        System.out.println("please input" + SEARCH_BOOKS_BY_TITLE + "for search book by title");
        System.out.println("please input" + PRINT_AUTHORS + "for print authers");
        System.out.println("please input" + PRINT_BOOKS + "for print books");
        System.out.println("please input" + SEARCH_BOOKS_BY_AUTHOR + "for SEARCH_BOOKS_BY_AUTHOR");
        System.out.println("please input" + COUNT_BOOKS_BY_AUTHOR + "for COUNT_BOOKS_BY_AUTHORS");
        System.out.println("please input" + CHANGE_AUTHORS + "for CHANGE_AUTHORS");
        System.out.println("please input" + CHANGE_BOOK_AUTHOR + "for CHANGE_BOOK_AUTHORS");
        System.out.println("please input" + DELETE_AUTHOR + "for DELETE_AUTHOR");
        System.out.println("please input" + DELETE_BOOK + "for DELETE_BOOK");
        System.out.println("please input" + DELETE_BOOK_BY_AUTHOR + "for DELETE_BOOK_BY_AUTHOR");


    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input auther's name");
        String name = scanner.nextLine();
        System.out.println("please input auther's surname");
        String surname = scanner.nextLine();
        System.out.println("please input auther's email");
        String email = scanner.nextLine();
        System.out.println("please input auther's gander");
        String gender = scanner.nextLine();
        System.out.println("please input auther's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author auther = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(auther.getEmail()) != null) {
            System.err.println("Invalid email. author with this email already exist");


        } else {
            authorStorage.add(auther);
            System.out.println("thank you, author was addid");
        }

    }
}



