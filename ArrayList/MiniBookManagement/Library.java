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
        System.out.println("1. Get the list of books \n2. Search any book \n3. Add new book and its category \n4. Remove any book");
        int option = sc.nextInt();

        switch(option){
            case 1:{
                lib.getAllBooks();
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
    }
}
