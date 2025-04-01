class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("123-ABC", "Java Basics", "John Doe");
        Book book2 = new Book("456-DEF", "Python Guide", "Jane Smith");

        displayLibraryName();
        book1.displayDetails();
        book2.displayDetails();
    }
}
