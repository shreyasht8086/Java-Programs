import java.util.Scanner;
class Employee
{
    private int id;
    private float sal;
    private String name;
    void set_id(int id)
    {
        this.id=id;
    }
    void set_sal(float sal)
    {
        this.sal=sal;
    }
    void set_name(String name)
    {
        this.name=name;
    }
    int get_id()
    {
      return id;
    }
    String get_name()
    {
      return name;
    }
    float get_sal()
    {
      return sal;
    }
  
  }
public class EmployeeApp{
    public static void main(String x[])
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of employee data");
            int emp_size=sc.nextInt();
            Employee emp[]=new Employee[emp_size];
            int i;
            Employee temp;
            for(i=0;i<emp.length;i++)
            {  emp[i]=new Employee();
              System.out.printf("Enter the Employee id\n");
              int emp_id=sc.nextInt();
              sc.nextLine();
              System.out.printf("Enter the employee name\n");
              String emp_name=sc.nextLine();
              System.out.printf("Enter the Employee salary\n");
              float emp_salary=sc.nextFloat();

              emp[i].set_id(emp_id);
              emp[i].set_name(emp_name);
              emp[i].set_sal(emp_salary);
            }
            temp=emp[0];
            //------------------------------------------Asscending order salary-------------------------------------------------------------
            for(i=0;i<emp.length;i++)
             {  
                for(int j=i+1;j<emp.length;j++)
                {
                   if(emp[i].get_sal()>emp[i+1].get_sal())
                   {
                       temp=emp[i];
                       emp[i]=emp[i+1];
                       emp[i+1]=temp;
                   }
                }
            }
            System.out.printf("Emp-id\tEmp-name\tEmp-salary\n");
            for(i=0;i<emp.length;i++)
            {
              System.out.printf("%d\t%s\t%f\n",emp[i].get_id(),emp[i].get_name(),emp[i].get_sal());
            }
            //----------------------------------------------------------------------Delete Employee----------------------------------------
            System.out.printf("Enter the position to delete employee data\n");
            int pos=sc.nextInt();
            for(i=pos-1;i<emp.length-1;i++)
            {
                emp[i]=emp[i+1];
            }
            System.out.printf("Emp-id\tEmp-name\tEmp-salary\n");
            for(i=0;i<emp.length-1;i++)
            {
              System.out.printf("%d\t%s\t%f\n",emp[i].get_id(),emp[i].get_name(),emp[i].get_sal());
            }
            sc.close();
    }

}
