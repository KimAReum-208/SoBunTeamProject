import java.util.*;
/**
 * Library class
 *
 * @author (2017315002 Kim Areum , 218315021 Bang Daeho,
 *          2018315051 Yamamoto Yoshika, 2018315003 Choi Sewon)
 * @version (2019.11.29)
 */
public class Library
{
    private String name;
    private HashSet<Borrower> User;
    private TreeSet<Book> registeredBook;
    private ArrayList<Loan> LoanInformation;
    
    public void ReturnOneBook(int catalogueNumber){
        if((findBook(catalogueNumber)) != null){
            Book book = checkBook();
            Borrower borrower = CheckBorrower();
            if(book != null && borrower != null)
                offConnect(book, borrower);
        }
    }

    public void RegisterOneBook(String name){
        if( CheckBook(catalogueNumber))
        {
            Book book = new Book(catalogueNumber, title, author);
            boolean result = registeredBook.add(book);
            if (result)
            {
                System.out.println("Registration succeeded");
            }
            else 
            {
                System.out.println("Registration failed");
            }
        }
    }

    public void RegisterOneBorrower(String name){
        if(CheckBorrower(name) == null){
            Borrower borrower = new Borrower(name);
            add(borrower);
        }
    }

    public void LendOneBook(String name, int catalogueNumber){
        Book book = findBook(catalogueNumber);
        Loan checkBook = CheckBook(catalogueNumber);
        Borrower borrower = getBorrower(name);
        if(book != null && borrower != null){
            newLoan(book, borrower);
            connent(book, borrower);
        }
    }

    public book DisplayBooksOnLoan(){
        display();
    }

    public book DisplayBooksForLoan(){
        display();
    }

    public String toString(){
        this.name = name;
    }
}
