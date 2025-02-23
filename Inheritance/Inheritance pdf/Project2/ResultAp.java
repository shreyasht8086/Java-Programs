import java.util.Scanner;

class Per {
     float per;
    void calPer(int s[])
    {   int sum=0;
         for(int i=0;i<s.length;i++)
         {
              sum=sum+s[i];
         }
         per=sum/s.length;
    }
    
}

class CSE extends Per {

     private int id;
     private  String name;
     private  String year;
     private String address;
     public CSE(int id, String name, String year, String address) {
         this.id = id;
         this.name = name;
         this.year = year;
         this.address = address;
     }
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getYear() {
         return year;
     }
     public void setYear(String year) {
         this.year = year;
     }
     public String getAddress() {
         return address;
     }
     public void setAddress(String address) {
         this.address = address;
     }
   
     public void showCsePer()
     {
         System.out.println(per);
     }
   
 }
 
  class ETC extends Per {

     private int id;
     private  String name;
     private  String year;
     private String address;
     public ETC(int id, String name, String year, String address) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.address = address;
    }
     
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getYear() {
         return year;
     }
     public void setYear(String year) {
         this.year = year;
     }
     public String getAddress() {
         return address;
     }
     public void setAddress(String address) {
         this.address = address;
     }
     public void showCsePer()
     {
         System.out.println(per);
     }
     
 }
 

public class ResultAp
 {

    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;

        do{
            System.out.println("1.CSE\n2.ETC\n3.Exit");
            ch=sc.nextInt();

            switch(ch){

                case 1:
                {
                    System.out.println("Enter the id of student");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of student");
                    String name=sc.nextLine();
                    System.out.println("Enter the year of student");
                    String year=sc.nextLine();
                    System.out.println("Enter the address of student");
                    String add=sc.nextLine();
                    System.out.println("Enter the marks of student");
                    int mark[]=new int[5];
                    for (int i = 0; i < mark.length; i++) {
                        mark[i]=sc.nextInt();
                    }
                    CSE cse=new CSE(id,name,year,add);
                    cse.calPer(mark);
                    cse.showCsePer();

                }break;
                case 2:
                {
                    System.out.println("Enter the id of student");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of student");
                    String name=sc.nextLine();
                    System.out.println("Enter the year of student");
                    String year=sc.nextLine();
                    System.out.println("Enter the address of student");
                    String add=sc.nextLine();
                    System.out.println("Enter the marks of student");
                    int mark[]=new int[5];
                    for (int i = 0; i < mark.length; i++) {
                        mark[i]=sc.nextInt();
                    }
                    ETC etc=new ETC(id,name,year,add);
                    etc.calPer(mark);
                    etc.showCsePer();


                }break;
                case 3:
                {

                }break;
            }


        }while(ch>=1&&ch<3);
    }
    
}
