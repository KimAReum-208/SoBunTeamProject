import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Borrower
{
    private String name;
    public ArrayList<Loan> LoanInformation;
    Set Borrower = new HashSet();
    public Borrower(String name){
        this.name = name;
        LoanInformation = new ArrayList<Loan>();
    }
    
    public void CheckBorrower(String name)
    {
        if (this.name != name)
        {
            System.out.println("ok");
        }
    }
    
    public Borrower getBorrower(String name){
        if (this.name == name)
        {
            return this;
        }
        else 
        {
            System.out.println("?΄?©? ? λ³΄λ?? μ°Ύμ ? ??΅??€.");
        }
    }
   
    public void add(Borrower borrower){
        Borrower.add(borrower);
    }
    
    public void connect(Loan loan){
        loan = this;
    }
    
    public void offConnect(Loan loan){
        loan = null;
    }
    
    public String toString(){
        return this.name;
    }
}
