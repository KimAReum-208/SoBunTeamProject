
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;

    public void ReturnOneBook(int catalogueNumber){
        if((findBook(catalogueNumber)) != null){
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
                System.out.println("���� �����߽��ϴ�");
            }
            else 
            {
                System.out.println("���� �����߽��ϴ�.");
            }
        }
    }

    public void RegisterOneBorrower(String name){
        if(chcek(name) == null){
            newBorrower(name);
            add(borrower);
        }
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

    public book DisplayBooksOnLoan(){
        display();
    }

    public book DisplayBooksForLoan(){
        display();
    }

    public String toString(){
        this.name = name;
    }
}
