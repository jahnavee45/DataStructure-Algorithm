import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java", "Software"));
        books.add(new Book("C++", "IT"));
        books.add(new Book("Python", "Software"));
        books.add(new Book("AWS", "Cloud"));

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any of the given options: ");
        System.out.println(
                "1. Get the list of books \n2. Search any book \n3. Add new book and its category \n4. Remove any book");
        int option = sc.nextInt();

        switch (option) {
            case 1: {
                lib.getAllBooks(books);
            }
            case 2: {
                System.out.println("Give the name of the book: ");
                String name = sc.nextLine();
                lib.searchBook(books, name);
            }
            case 3: {
                System.out.println("Give the name of the book: ");
                String name = sc.nextLine();
                System.out.println("Give the category: ");
                String category = sc.nextLine();
                lib.addNewBook(books, name, category);
            }
        }
        sc.close();
    }

    private void getAllBooks(ArrayList<Book> books) {
        System.out.println("This is the list of books along with category: ");
        for(Book book : books){
            System.out.println(book.getBook() + " " + book.getCategory());
        }

    }

    private void searchBook(ArrayList<Book> books, String name) {
        for(Book book : books){
            if(book.getBook().equals(name)){
                System.out.println(book.getBook() + " " + book.getCategory());
            }
        }
    }

    private void addNewBook(ArrayList<Book> books, String name, String category) {
        books.add(new Book(name, category));
        System.out.println("New book added!");
    }
}
