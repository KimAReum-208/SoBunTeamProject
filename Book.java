import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private static int catalogueNumber;
    private String title;
    private String author;
    //TreeSet tree = new TreeSet(); // λΆ? λ¦¬μ€?Έκ°? ?΄κ²¨μ Έ?? μ»¬λ ?
    public TreeSet<Loan> LoanInformation;

    public Book(int catalogueNumber,String title,String author)
    {
        this.catalogueNumber = catalogueNumber;
        this.title = title;
        this.author = author;
        LoanInformation = new TreeSet<Loan>();
    }

    public void add(Book book)
    {
        boolean result = LoanInformation.add(book);
    }

    public Book findBook(int catalogueNumber)
    {
        if (this.catalogueNumber == tree.catalogueNumber)
        {
            return this;
        }
        else if(this.catalogueNumber == Book.catalogueNumber)
        {
            return this;
        }
        else 
        {
            System.out.println("?±λ‘λ?΄?μ§? ?? μ±μ??€.");
        }
    }

    public Loan checkBook()
    {
        if (this.catalogueNumber == this.catalogueNumber)
        {
            return loan;
        }

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
