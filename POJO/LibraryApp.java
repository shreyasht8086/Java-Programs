import java.util.Scanner;

class Library{
    private int Id,Price,AccessionNumber;
    private  String AuthorName,Title;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public int getAccessionNumber() {
        return AccessionNumber;
    }
    public void setAccessionNumber(int accessionNumber) {
        AccessionNumber = accessionNumber;
    }
    public String getAuthorName() {
        return AuthorName;
    }
    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
   
}
class LibraryFunctions{
    Scanner sc=new Scanner(System.in);
    Library lib[];
    void add()
    {
        System.out.println("Enter the size of data");
        int size=sc.nextInt();
        lib=new Library[size];
        for(int i=0;i<lib.length;i++)
        {
            lib[i]=new Library();
            System.out.println("Enter the book id ");
            int id=sc.nextInt();
            System.out.println("Enter the Book accession number");
            int accession_no=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Title of book");
            String title=sc.nextLine();
            System.out.println("Enter the Author name");
            String auth_name=sc.nextLine();
            System.out.println("Enter the price of book");
            int price=sc.nextInt();

            lib[i].setId(id);
            lib[i].setAccessionNumber(accession_no);
            lib[i].setAuthorName(auth_name);
            lib[i].setPrice(price);
            lib[i].setTitle(title);
        }       
    }
    void display()
    {
        for(int i=0;i<lib.length;i++)
        {
           System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
        }
    }
    void displayByAuthor()
    {
        sc.nextLine();
        System.out.println("Enter the name of author");
        String s_name=sc.nextLine();
        for(int i=0;i<lib.length;i++)
        {
            if(s_name.equals(lib[i].getAuthorName()))
            {
              System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
            }
        }
    }
    void displayByTitle()
    {
        sc.nextLine();
        System.out.println("Enter the titlee of book");
        String s_title=sc.nextLine();
        for(int i=0;i<lib.length;i++)
        {
            if(s_title.equals(lib[i].getTitle()))
            {
              System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
            }
        }
    }
    void displayBookCount()
    {   int count=0;
        for(int i=0;i<lib.length;i++)
        {
            System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
            count++;
        } 
        System.out.println("Book Count: "+count);
    }
    void displayBookAccending()
    {   Library temp=lib[0];
        for(int i=0;i<lib.length;i++)
        {
             for(int j=i+1;j<lib.length;j++)
             {
                if(lib[i].getAccessionNumber()>lib[j].getAccessionNumber())
                {
                    temp=lib[i];
                    lib[i]=lib[j];
                    lib[j]=temp;
                }
             }
        }
        System.out.println("Book in Accending order according to accession number");
        for(int i=0;i<lib.length;i++)
        {
           System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
        }
    }
    void updateBookByTitle()
    {
        sc.nextLine();
        System.out.printf("Enter book title you want to update\n");
        String s_title=sc.nextLine();
        System.out.println("Enter the new author name");
        String n_author=sc.nextLine();
        System.out.println("Enter the new title of book");
        String n_title=sc.nextLine();
        System.out.println("Enter the new price of book");
        int n_price=sc.nextInt();
        System.out.println("Enter new accession number");
        int n_acc=sc.nextInt();
        
        for(int i=0;i<lib.length;i++)
        {
            if(s_title.equals(lib[i].getTitle()))
            {
                lib[i].setAccessionNumber(n_acc);
                lib[i].setAuthorName(n_author);
                lib[i].setTitle(n_title);
                lib[i].setPrice(n_price);
            }
        }
    }
    void deleteBookById()
    {
        System.out.printf("Enter the id of Book");
        int s_id=sc.nextInt();
        // int count=0;
        for(int i=0;i<lib.length;i++)
        {
            if(s_id==(lib[i].getId()))
            {
                for(int j=i;j<lib.length;j++)
                {
                 lib[j]=lib[j+1];
                }
                
            }
        }
        System.out.println("After deletion");
        for(int i=0;i<lib.length-1;i++)
        {
            System.out.println(lib[i].getId()+"\t"+lib[i].getAccessionNumber()+"\t"+lib[i].getTitle()+"\t"+lib[i].getAuthorName()+"\t"+lib[i].getPrice());
        }

    }
}
public class LibraryApp{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int ch;
        LibraryFunctions lf=new LibraryFunctions();
        do{
            System.out.printf("1.Add Book details\n");
            System.out.printf("2.Display All Book details\n");
            System.out.printf("3.Display list of all book of given author\n");
            System.out.printf("4.Display book by specified title\n");
            System.out.printf("5.Display list count of book in the library\n");
            System.out.printf("6.Dispaly list of book in acsending order of acession number\n");
            System.out.printf("7.Update book details by title of book\n");
            System.out.printf("8.Delete the book details by id\n");
            System.out.printf("9.Exit code\n");
            System.out.printf("Enter your choice\n");
            ch=sc.nextInt();

            switch (ch) {
                case 1:
                  {
                     lf.add();
                  }   
                break;    
                case 2:
                  {
                     lf.display();
                  }  
                break;
                case 3:  
                 {
                    lf.displayByAuthor();
                 }   
                break;    
                case 4:
                 {
                    lf.displayByTitle();
                 }   
                break;
                case 5:
                {
                    lf.displayBookCount();
                }  
                break;    
                case 6:
                {
                    lf.displayBookAccending();
                }   
                break;
                case 7:
                  {
                     lf.updateBookByTitle();
                  }    
                break;    
                case 8:
                {
                    lf.deleteBookById();
                }   
                break;
                case 9:
                {
                    ch=9;
                }
                break;
                default:
                    break;
            }

        }while(ch>=1&&ch<=8);
        sc.close();
    }
    
}