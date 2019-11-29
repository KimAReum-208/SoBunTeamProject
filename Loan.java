import java.util.ArrayList;
/**
 * Write a description of class Ioan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private laonDate Date;
    private returnDate Date;
    
    public LocalDate getLoanDate(){
        
    }
    
    public LocalDate ReturnDate(){
        
    }
    
    public String toString(){
        
    }
    
    public void connect(Book book,Borrower borrower){
        book.connect(this);
        borrower.connect(this);
    }
    
    public void offConnect(Book book,Borrower borrower){
        book.offConnect(this);
        borrower.offConnect(this);
    }
    
   public Loan(Book book,Borrower borrower,Data loanData ,Data returnData){
       this.book = book;
       this.borrower = borrower;
       this.loanData = loanData;
       this.returnData = returnData;
    }
}
