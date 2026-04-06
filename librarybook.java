
public class librarybook {
    int book_id;
    String bookname;
    String author;
    boolean isissued=false;
    void issuebook()
    {
        if(isissued==false)
        {
            isissued=true;
            System.out.println("Book Issued Sucessfully");
        }
        else{
            System.out.println("Book is already issued");
        }
    }
    void returnbook()
    {
        if(isissued==true)
        {
            isissued=false;
            System.out.println("Book Returned Sucessfully");
        }
        else{
            System.out.println("Book is not issued");
        }
    }
    void display()
    {
        System.out.println("Book ID:"+book_id);
        System.out.println("Book Name:"+bookname);
        System.out.println("Author:"+author);
        System.out.println("Is Issued:"+isissued);
    }
    public static void main(String[] args) {
        librarybook l=new librarybook();
        l.book_id=101;
        l.bookname="Java Programming";
        l.author="John Doe";
        l.display();
        l.issuebook();  
        l.returnbook();
        l.display();
    }
}
