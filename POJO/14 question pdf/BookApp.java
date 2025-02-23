import java.util.Scanner;

class Book{

    private int isbn;
    private String title,author;
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class BookFunctions{
    Scanner sc=new Scanner(System.in);
    Book book[];

    void add()
    {
       
        System.out.println("Enter the size of data");
        int size=sc.nextInt();
        book=new Book[size];
        for(int i=0;i<book.length;i++)
        {
            System.out.println("Enter the ISBN number");
            int isbn=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Book title");
            String title=sc.nextLine();
            System.out.println("Enter the Book author");
            String author=sc.nextLine();
            book[i]=new Book();
            book[i].setIsbn(isbn);
            book[i].setAuthor(author);
            book[i].setTitle(title);
        }

    }
    void view()
    {
        System.out.println("Enter the detail to view");
        String str=sc.nextLine();

        for(int i=0;i<book.length;i++)
        {
            if(str.equalsIgnoreCase(Integer.toString(book[i].getIsbn()))||
              str.equals((book[i].getAuthor()))||str.equals((book[i].getTitle())))
              {
                 System.out.println(book[i].getIsbn()+"  "+book[i].getTitle()+"  "+book[i].getAuthor());
              }
        }
    }
    void show()
    {
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].getIsbn()+"  "+book[i].getTitle()+"  "+book[i].getAuthor());
        }
    }
    void update()
    {
        
        System.out.println("Enter the detail to update");
        String str=sc.nextLine();
        for(int i=0;i<book.length;i++)
        {
            if(str.equalsIgnoreCase(Integer.toString(book[i].getIsbn()))||
              str.equals((book[i].getAuthor()))||str.equals((book[i].getTitle())))
              {
                System.out.println("Enter the ISBN number");
                int isbn=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Book title");
                String title=sc.nextLine();
                System.out.println("Enter the Book author");
                String author=sc.nextLine();

                book[i].setIsbn(isbn);
                book[i].setAuthor(author);
                book[i].setTitle(title); 
              }
        }
    }
    void remove()
    {   System.out.println("Enter the detail to remove");
        String str=sc.nextLine();

        for (int i = 0; i < book.length; i++) {
            if(str.equalsIgnoreCase(Integer.toString(book[i].getIsbn()))||
            str.equals((book[i].getAuthor()))||str.equals((book[i].getTitle())))
            {
               for (int j = i; j < book.length-1; j++) {
                  book[j]=book[j+1];
               }
               
            }
            
        }
        for (int i = 0; i < book.length-1; i++) {
            System.out.println(book[i].getIsbn()+"  "+book[i].getTitle()+"  "+book[i].getAuthor());
        }
        
    }

}
public class BookApp{
    public static void main(String x[])
    {
          Scanner sc=new Scanner(System.in);
          BookFunctions bf=new BookFunctions();
          int ch;
          do
          {
             System.out.println("1.ADD\n2.VIEW\n3.SHOW\n4.UPDATE\n5.REMOVE\n6.EXIT");
             System.out.println("Enter your choice");
             ch=sc.nextInt();

             switch (ch)
             {
                case 1:
                {
                    bf.add();
                }
                break;
                case 2:
                {
                   bf.view();
                }
                break;
                case 3:
                {
                  bf.show();
                }
                break;
                case 4:
                {
                   bf.update();
                }
                break;
                case 5:
                {
                   bf.remove(); 
                }
                break;
             }
             
          } while(ch>0&&ch<=5);
    }
}