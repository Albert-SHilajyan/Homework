package author;

import java.util.Scanner;

public class AuthorTest {

        static Scanner scanner = new Scanner(System.in);
        static AuthorStorage authorStorage = new AuthorStorage();
        static BookStorage bookStorage = new BookStorage();

        private static final String EXIT = "0";
        private static final String ADD_AUTHOR = "1";
        private static final String SEARCH_AUTHORS = "2";
        private static final String SEARCH_AUTHORS_BY_AGE = "3";
        private static final String PRINT_AUTHORS = "4";
        private static final String ADD_BOOK = "5";
        private static final String SEARCH_BOOKS_BY_TITLE = "6";
        private static final String PRINT_BOOKS = "7";

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
                    case SEARCH_AUTHORS:
                        searchByName();
                        break;
                    case SEARCH_AUTHORS_BY_AGE:
                        searchByAge();
                        break;
                    case PRINT_AUTHORS:
                        authorStorage.print();
                        break;
                    case ADD_BOOK:
                        addBook();
                        break;
                    case SEARCH_BOOKS_BY_TITLE:
                        searchByTitle();
                        break;
                    case PRINT_BOOKS:
                        bookStorage.print();
                    default:
                        System.err.println("Invalid command");
                }

            }


        }

    private static void searchByTitle() {
            System.out.println("please input keyword1");
        String keyword1 = scanner.nextLine();
        bookStorage.searchByTitle(keyword1);

    }

    private static void addBook() {

        System.out.println("please input book title");
        String title = scanner.nextLine();
        System.out.println("please input book discription");
        String discription = scanner.nextLine();
        System.out.println("please input book price");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("please input books count");
        int count =Integer.parseInt(scanner.nextLine());

        Book book = new Book( );

        bookStorage.add(book);
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
            System.out.println("please input" + SEARCH_AUTHORS + "for search auther by name");
            System.out.println("please input" + SEARCH_AUTHORS_BY_AGE + "for search auther by age");
            System.out.println("please input" + PRINT_AUTHORS + "for print authers");
            System.out.println("please input" + ADD_BOOK + "for add book");
            System.out.println("please input" + SEARCH_BOOKS_BY_TITLE + "for search book by title");
            System.out.println("please input" + PRINT_BOOKS + "for print books");

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

            authorStorage.add(auther);
        }
    }



