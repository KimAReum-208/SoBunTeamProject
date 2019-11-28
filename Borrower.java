import java.util.*;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Borrower
{
    private String name;
    Set h = new HashSet();
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
