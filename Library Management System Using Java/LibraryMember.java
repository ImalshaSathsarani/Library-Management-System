

import java.util.ArrayList;

public class LibraryMember {
    private int memberID;
    private  String name;
    private ArrayList<Book>borrowedBooks;


    public LibraryMember(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;

        borrowedBooks= new ArrayList<>();
    }

    public LibraryMember() {
        this.memberID = memberID;
        this.name = name;

        borrowedBooks= new ArrayList<>();
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        Library library1=new Library();
        if (library1.collectionOfBooks.contains(book)) {
            borrowedBooks.add(book);
            library1.collectionOfBooks.remove(book);
            System.out.println(name + "has borrowed the book" + book.getTitle());
        } else {
            System.out.println("The book  is not available");
        }
    }


    public void returnBook(Book book) {
        Library library2=new Library();
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
           library2.collectionOfBooks.add(book);
            System.out.println("The book" + book.getTitle() + "has returned");
        } else {
            System.out.println("Book not found in borrowed books");
        }
    }

    public void displayMemberInfo(){
        System.out.println("Member ID:"+memberID);
        System.out.println("Name:"+name);
        System.out.println("The borrowed books of"+name+":");
        for (Book book:borrowedBooks)
            book.displayBookInfo();

    }
}

