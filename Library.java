
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
        
    }
    
    public void RegisterOneBook(String name){
        if( CheckBook(catalogueNumber))
        {
            Book book = new Book(catalogueNumber, title, author);
            boolean result = registeredBook.add(book);
            if (result)
            {
                System.out.println("등록되었습니다.");
            }
            else 
            {
                System.out.println("실패하였습니다.");
            }
        }
    }
    
    public void RegisterOneBorrower(String name){
        
    }
    
    public void LendOneBook(String name, int catalogueNumber){
        
    }
    
    public book DisplayBooksInLoan(){
        return book;
    }
    
    public book DisplayBooksForLoan(){
        return book;
    }
    
    public String toString(){
        this.name = name;
    }
}
