public class Book {

       public String title;
    public String author;
    public int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title; 
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + this.yearPublished);
    }

       public static void main(String[] args) {
                Book book1 = new Book("The Alchemist", "Paulo Coelho", 1988);

        book1.displayBookDetails();
    }
}
