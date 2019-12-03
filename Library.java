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
    
    public Library(){
        this.name = name;
    }
    
    public void ReturnOneBook(int catalogueNumber){
        if((findBook(catalogueNumber)) != null){
            Book book = checkBook();
            Borrower borrower = CheckBorrower();
            if(book != null && borrower != null)
                offConnect(book, borrower);
        }
    }

    public void RegisterOneBook(int catalogueNumber, String title, String author, int count){
        if(CheckBook(catalogueNumber))
        {
            Book book = new Book(catalogueNumber, title, author, count);
            boolean result = add(book);
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

    public void RegisterOneBorrower(String name, int count){
        if(CheckBorrower(name) == null){
            Borrower borrower = new Borrower(name, count);
            add(borrower);
        }
    }

    public void LendOneBook(String name, int catalogueNumber){
        Book book = findBook(catalogueNumber);
        Loan checkBook = CheckBook(catalogueNumber);
        Borrower borrower = getBorrower(name);
        if(book != null && borrower != null){
            Loan loan = Loan(book, borrower, loanDate, returnDate);
            connent(book, borrower);
            System.out.println(loan);
        }
    }

    public Book DisplayBooksOnLoan(){
        display();
    }

    public Book DisplayBooksForLoan(){
        display();
    }

    public String toString(){
        this.name = name;
    }
    
    public void searchBestBook(){
        getBestBook();   
    }
    
    public void DisplayKingOfReading(){
        getKingOfReading();
    }
    
    public void resetCount(){
        CountBookReset();
        CountBorrowerReset();
    }
    
    public void DisplayBestBook(){
        getBestBook();
    }
}
