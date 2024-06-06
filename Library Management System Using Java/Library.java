import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Library {

    public ArrayList<Book>collectionOfBooks;
    private ArrayList<LibraryMember> libraryMembers;

    public Library() {
        collectionOfBooks=new ArrayList<>();
        libraryMembers=new ArrayList<>();

    }

    public void addBook(Book book){
        collectionOfBooks.add(book);

        System.out.println("The book"+book.getTitle()+"added successfully");

    }
    public void addMember(LibraryMember member){
        libraryMembers.add(member);

        System.out.println("The member"+member.getName()+"added succesfully");
    }

    public void displayAvailableBooks(){
        System.out.println("Available books are:");
        for (Book book:collectionOfBooks)
            book.displayBookInfo();
    }

    public LibraryMember getMemberInfo(int memberID){
        for(LibraryMember member:libraryMembers){
            if(member.getMemberID()==memberID){
                return member;

            }
        }return null;

    }
    public Book getBookInfo(int ISBN){
        for(Book book:collectionOfBooks){
            if(book.getISBN()==ISBN){
                return book;
            }
        }return null;
    }
    public static double displayLatefees(LocalDate dueDate, LocalDate returnDate){
            if (returnDate.isAfter(dueDate)) {
                long daysOverDue = ChronoUnit.DAYS.between(dueDate, returnDate);
                double lateFees = daysOverDue * 10;
              return lateFees;
            } else {
            return 0.0;
        }
    }

}
