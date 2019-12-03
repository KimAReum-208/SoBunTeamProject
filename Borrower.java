import java.util.*;
/**
 * Borrower class
 * 
 *
 * @author (2017315002 Kim Areum , 218315021 Bang Daeho,
 *          2018315051 Yamamoto Yoshika, 2018315003 Choi Sewon)
 * @version (2019.11.29)
 */
public class Borrower
{
    private String name;
    private int count;
    public ArrayList<Loan> LoanInformation;
    Set Borrower = new HashSet();
    
    public Borrower(String name, int count){
        this.name = name;
        this.count = 0;
        LoanInformation = new ArrayList<Loan>();
    }
    
    public void CheckBorrower(String name)
    {
        if (this.name != name)
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("Users already exists.");
        }
    }
    
    public Borrower getBorrower(String name){
        if (this.name == name)
        {
            return this;
        }
        else 
        {
            System.out.println("User not found");
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
    
    public void getKingOfReading(){
        sortCollection();
    }
    
    public void sortCollection(){
        
    }
    
    public void CountBorrowerReset(){
        while(User.size()){
            CountReset();
        }
    }
    
    public void CountReset(){
        
    }
}
