import java.util.*;
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    private static int catalogueNumber;
    private String title;
    private String author;
    TreeSet tree = new TreeSet(); // 북 리스트가 담겨져있는 컬렉션
    
    public Book(int catalogueNumber,String title,String author)
    {
        this.catalogueNumber = catalogueNumber;
        this.title = title;
        this.author = author;
    }
    
    public void add(Book book)
    {
        tree.add(this);
    }

    public Book finBook(int catalogueNumber)
    {
        if (this.catalogueNumber != catalogueNumber)
        {
            return this;
        }
    }

    public Loan chekBook()
    {
        
        return Loan loan;
    }

    public void offConnect()
    {
        Loan loan = null;
    }
    
    public void connect(Loan laon)
    {
        Loan laon = this;
    }

    public void display()
    {
        while(tree.hasNext())
        {
            if(Loan.BorrowerdBook != null)
                System.out.println(tree);
            else if (Loan.borrower == null)
                System.out.println(tree);
        }
    }

    public String toString()
    {
        return this.catalogueNumber + "," + this.title  + "," + this.author;
    }

    public void CheckBook(int catalogueNumber)
    {
        if (this.catalogueNumber != catalogueNumber)
        {
            System.out.println("ok");
        }
    }
}
