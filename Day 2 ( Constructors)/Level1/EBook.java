class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}


class EBook extends BookLibrary {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBook() {
        System.out.println("E-Book ISBN: " + ISBN + ", Title: " + title);
    }

    public static void main(String[] args) {
        EBook eBook = new EBook("123456", "Java Programming", "John Doe");
        eBook.displayEBook();
    }
}
