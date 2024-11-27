public class Book {
    private String book;
    private String category;

    public Book(String book, String category){
        this.book = book;
        this.category = category;
    }

    public String getBook(){
        return book;
    }

    public String getCategory(){
        return category;
    }
}
