
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;

    public void ReturnOneBook(int caralogueNumber){
        if((findBook(caralogueNumber)) != null){
            Book book = checkBook();
            Borrower borrower = CheckBorrower();
            if(book != null && borrower != null)
                offConnect(book, borrower);
        }
    }

    public void RegisterOneBook(String name){
        if( CheckBook(catalogueNumber))
        {
            Book book = new Book(catalogueNumber, title, author);
            boolean result = registeredBook.add(book);
            if (result)
            {
                System.out.println("?ì±Î°ùÎêò?óà?äµ?ãà?ã§.");
            }
            else 
            {
                System.out.println("?ã§?å®?ïò???äµ?ãà?ã§.");
            }
        }
    }

    public void RegisterOneBorrower(String name){

    }

    public void LendOneBook(String name, int catalogueNumber){
        Book book = findBook(catalogueNumber);
        Loan checkBook = CheckBook(catalogueNumber);
        Borrower borrower = getBorrower(name);
        if(book != null && borrower != null){
            newLoan(book, borrower);
            connent(book, borrower);
        }
    }

    public book DisplayBooksInLoan(){
        display();
    }

    public book DisplayBooksForLoan(){
        return book;
    }

    public String toString(){
        this.name = name;
    }
}
