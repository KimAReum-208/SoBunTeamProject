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
    Set hashSet = new HashSet();
    public Borrower(String name){
        this.name = name;
    }
    
    public Borrower getBorrower(String name){
        return Borrower borrower;
    }
    
    public Borrower MakeBorrower(String name){
        return Borrower borrower;
    }
    
    public void add(Borrower borrower){
        hashSet.add(borrower);
    }
    
    public void connect(Loan loan){
        
    }
    
    public void offConnect(Loan loan){
        
    }
    
    public String toString(){
        return this.name;
    }
}
