class Book {
    String title, author;
    double price;
    boolean available = true;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James Gosling", 300);
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
    }
}
