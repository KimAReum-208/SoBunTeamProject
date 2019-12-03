import java.util.*;
/**
 * Book class
 *
 * @author (2017315002 Kim Areum , 218315021 Bang Daeho,
 *          2018315051 Yamamoto Yoshika, 2018315003 Choi Sewon)
 * @version (2019.11.29)
 */
public class Book
{
    private static int catalogueNumber;
    private String title;
    private String author;
    TreeSet tree = new TreeSet(); // 
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
            System.out.println("I can't find the book.");
        }
    }

    public Loan checkBook()
    {
        if (this.catalogueNumber == tree.catalogueNumber)
        {
            return loan;
        }

    }

    public void offConnect(Loan loan)
    {
        Loan loan = null;
    }

    public void connect(Loan loan)
    {
        Loan loan = this;
    }

    public void displayBooksForLoan()
    {
        while(tree.hasNext())
        {
            if (this.LoanInformation == null)
                System.out.println(tree);
        }
    }
    public void displayBooksOnLoan()
    {
        while(tree.hasNext())
        {
            if(this.LoanInformation != null)
                System.out.println(tree);
        }
    }

    public String toString()
    {
        return this.catalogueNumber + "," + this.title  + "," + this.author;
    }

    public Boolean CheckBook(int catalogueNumber)
    {
        if (this.catalogueNumber != catalogueNumber)
        {
            return false;
        }
        else{
            return true;
        }
    }
}
