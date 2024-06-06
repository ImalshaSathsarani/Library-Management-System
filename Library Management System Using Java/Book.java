public class Book {

    private int ISBN;
    private String title;
    private String author;
    private int  publicationYear;

    public Book(){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }

    public Book(int ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void displayBookInfo(){
        System.out.println("ISBN:"+ISBN);
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book:"+author);
        System.out.println("Publication year of the book:"+publicationYear);
    }
}
