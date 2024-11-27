import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java", "Software"));
        books.add(new Book("C++", "IT"));
        books.add(new Book("Python", "Software"));
        books.add(new Book("AWS", "Cloud"));

        Library lib = new Library();
        
        System.out.println("Select any of the given options: ");
        System.out.println("1. Search any book \n2. Add new book and its category \n3. Remove any book");
    }
}
