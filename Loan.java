import java.util.*;
import java.time.*;
/**
 * Loan class
 *
 * @author (2017315002 Kim Areum , 218315021 Bang Daeho,
 *          2018315051 Yamamoto Yoshika, 2018315003 Choi Sewon)
 * @version (2019.11.29)
 */
public class Loan
{
    private LocalDate loanDate;
    private LocalDate returnDate;
    
    public Loan(Book book,Borrower borrower,LocalDate loanDate ,LocalDate returnDate){
       this.book = book;
       this.borrower = borrower;
       this.loanDate = loanDate;
       this.returnDate = returnDate;
    }
    
    public LocalDate getLoanDate(){
        return loanDate;
    }
    
    public LocalDate ReturnDate(){
        return returnDate;
    }
    
    public String toString(){
        return this.book+ "," + this.borrower + "," + 
               this.loanDate + "," + this.returnDate;
    }
    
    public void connect(Book book,Borrower borrower){
        book.connect(this);
        borrower.connect(this);
    }
    
    public void offConnect(Book book,Borrower borrower){
        book.offConnect(this);
        borrower.offConnect(this);
    }
    
}
