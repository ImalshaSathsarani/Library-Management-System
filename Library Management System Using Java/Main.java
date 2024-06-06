import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Library library = new Library();
        LibraryMember member = new LibraryMember();
        Book book = new Book();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("//////  WELCOME TO LIBRARY MANAGEMENT SYSTEM  //////");
            System.out.println("1.Add a book");
            System.out.println("2.Add a member");
            System.out.println("3.Display available books");
            System.out.println("4.Display late fee");
            System.out.println("5.Borrow a book");
            System.out.println("6.Return a book");
            System.out.println("7.Display member information");
            System.out.println("8.Display book information");
            System.out.println("9.Exit");
            System.out.println("Enter the choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter  the ISBN number:");
                    int ISBN = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the title of the book:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author of  the book:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the publication year of the book:");
                    int publicationYear = scanner.nextInt();

                    Book newBook = new Book(ISBN, title, author, publicationYear);
                    library.addBook(newBook);

                    break;

                case 2:
                    System.out.println("Enter the ID:");
                    int memberID = scanner.nextInt();
                    System.out.println("Enter the name of the member:");
                    String name = scanner.nextLine();

                    LibraryMember newMember = new LibraryMember(memberID, name);
                    library.addMember(newMember);

                    break;

                case 3:
                    library.displayAvailableBooks();

                    break;

                case 4:
                   System.out.println("Enter due date(YYYY-MM-DD):");
                   String dueDateStr=scanner.next();
                   LocalDate dueDate=LocalDate.parse(dueDateStr, DateTimeFormatter.ISO_DATE);

                   System.out.println("Enter return date(YYYY-MM-DD):");
                   String returnDateStr=scanner.next();
                   LocalDate returnDate=LocalDate.parse(returnDateStr,DateTimeFormatter.ISO_DATE);

                   double late_fees=Library.displayLatefees(dueDate,returnDate);
                   System.out.println("Late fee:"+late_fees);



                    break;

                case 5:
                    System.out.println("Enter  the ISBN number of borrowing book:");
                    int B_ISBN = scanner.nextInt();
                    System.out.println("Enter the title of the borrowing  book:");
                    String B_title = scanner.nextLine();
                    System.out.println("Enter the author of  the borrowing book:");
                    String B_author = scanner.nextLine();
                    System.out.println("Enter the publication year of the borrowing book:");
                    int B_publicationYear = scanner.nextInt();


                    Book borrowBook = new Book(B_ISBN, B_title, B_author, B_publicationYear);
                    member.borrowBook(borrowBook);

                    break;


                case 6:
                    System.out.println("Enter  the ISBN number of returning book:");
                    int R_ISBN = scanner.nextInt();
                    System.out.println("Enter the title of the returning  book:");
                    String R_title = scanner.nextLine();
                    System.out.println("Enter the author of  the returning book:");
                    String R_author = scanner.nextLine();
                    System.out.println("Enter the publication year of the returning book:");
                    int R_publicationYear = scanner.nextInt();


                    Book returnBook = new Book(R_ISBN, R_title, R_author, R_publicationYear);
                    member.returnBook(returnBook);

                    break;

                case 7:
                    System.out.println("Enter member ID:");
                    int memberInfoId = scanner.nextInt();
                    LibraryMember memberinfo = library.getMemberInfo(memberInfoId);
                    if (memberinfo != null)
                        memberinfo.displayMemberInfo();
                    else
                        System.out.println("Member not found.");


                    break;

                case 8:
                    System.out.println("Enter the ISBN of the book:");
                    int ISBN_info = scanner.nextInt();

                    Book bookInfo = library.getBookInfo(ISBN_info);
                    if (bookInfo != null)
                        bookInfo.displayBookInfo();
                    else
                        System.out.println("The book not found");

                    break;

                case 9:
                    System.out.println("Exiting the library  management system...Bye!!! ");

                    break;
                default:
                    System.out.println("Invalid choice");


            }

        } while (choice != 9);


    }


}