import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java", "Software"));
        books.add(new Book("C++", "IT"));
        books.add(new Book("Python", "Software"));
        books.add(new Book("AWS", "Cloud"));
        books.add(new Book("Azure", "Cloud"));
        books.add(new Book("Spring Boot", "Enterprise Application"));

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any of the given options: ");
        System.out.println(
                "1. Get the list of books \n2. Search any book \n3. Add new book and its category \n4. Remove any book \n5.Exit");
        int option = sc.nextInt();
        sc.nextLine();

        do {
            switch (option) {
                case 1: {
                    lib.getAllBooks(books);
                    System.out.println("Select any option from 1 to 5: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                }
                case 2: {
                    System.out.println("Give the name of the book: ");
                    String name = sc.nextLine();
                    lib.searchBook(books, name);
                    System.out.println("Select any option from 1 to 5: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                }
                case 3: {
                    System.out.println("Give the name of the book: ");
                    String name = sc.nextLine();
                    System.out.println("Give the category: ");
                    String category = sc.nextLine();
                    books.add(new Book(name, category));
                    System.out.println("New book added!");
                    System.out.println("Select any option from 1 to 5: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                }
                case 4: {
                    System.out.println("Give the name of book to remove: ");
                    String name = sc.nextLine();
                    lib.removeBook(books, name);
                    System.out.println("Select any option from 1 to 5: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                }
            }
        }while (option != 5);
        sc.close();
    }

    private void getAllBooks(ArrayList<Book> books) {
        System.out.println("This is the list of books along with category: ");
        for (Book book : books) {
            System.out.println(book.getBook() + " " + book.getCategory());
        }

    }

    private void searchBook(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getBook().equals(name)) {
                System.out.println(book.getBook() + " " + book.getCategory());
            }
        }
    }

    private void removeBook(ArrayList<Book> books, String name) {
        books.removeIf(book -> book.getBook().equals(name));
    }
}
