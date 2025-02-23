import java.util.*;
class Admission
{
    private int id,tfees,pfees;
    private String name,branch;
    private float per;
    void set_field_id(int i)
    {
        id=i;
    }
    void set_total_fees(int t)
    {
        tfees=t;
    }
    void set_paid_fees(int p)
    {
        pfees=p;
    }
    void set_name(String s)
    {
        name=s;
    }
    void set_branch(String str)
    {
      branch=str;
    }
    void set_percent(float pe)
    {
          per=pe;
    }
    float get_percent()
    {
        return per;
    }
    int get_field_id()
    {
        return id;
    }
    int get_total_fees()
    {
        return tfees;
    }
    int get_paid_fees()
    {
        return pfees;
    }
    String get_name()
    {
       return name;
    }
    String get_branch()
    {
      return branch;
    }
}
class Discount{
    Admission add;
    void set_discount(Admission ad)
    {
          add=ad;
    }
    float get_discount()
    {
        if(add.get_percent()>60)
        {
            float dis=(add.get_total_fees()*0.30f);
            return dis;
        }
        else{

            return 0;
        }
    }
}
class StudentDetails{
  Admission add;
  
   void addNewStudent(Admission ad)
   {
        add=ad;
   }
   void showAdmission()
   {
      System.out.printf("----------------------Student data-------------------------\n");
      System.out.printf("ID:%d\n",add.get_field_id());
      System.out.printf("Name:%s\n",add.get_name());
      System.out.printf("Branch:%s\n",add.get_branch());
      System.out.printf("Percentage:%f\n",add.get_percent());
      System.out.printf("Total fees :%d\n",add.get_total_fees());
      System.out.printf("Paid fees :%d\n",add.get_paid_fees());
     
   }

}

public class StudentApp{
    public static void main(String x[])
    {
      StudentDetails sd=new StudentDetails();
      Admission add= new Admission(); 
      Scanner scan =new Scanner(System.in);
      System.out.println("Enter the name of student");
      String s_name=scan.nextLine();
      System.out.println("Enter the student id");
      int s_id=scan.nextInt();
      scan.nextLine();
      System.out.println("Enter the Branch");
      String s_branch=scan.nextLine();
      System.out.println("Enter the total fees");
      int s_total_fees=scan.nextInt();
      System.out.println("Enter the paid fees");
      int s_paid_fees=scan.nextInt();
      System.out.println("Enter the percent");
      float s_percent=scan.nextFloat();

      
      add.set_field_id(s_id);
      add.set_branch(s_branch);
      add.set_name(s_name);
      add.set_percent(s_percent);
      add.set_total_fees(s_total_fees);
      add.set_paid_fees(s_paid_fees);
      

      sd.addNewStudent(add);
      sd.showAdmission();
      Discount dis=new Discount();
      dis.set_discount(add);
      System.out.printf("Discount:%f\n",dis.get_discount());
      System.out.printf("----------------------Student data-------------------------");
    }
  
  }
