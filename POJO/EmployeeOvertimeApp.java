import java.util.Scanner;

class EmpolyeeDetails{
     private int emp_id,total_working,overtime;
     private String emp_name;
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public int getTotal_working() {
        return total_working;
    }
    public void setTotal_working(int total_working) {
        this.total_working = total_working;
    }
    public int getOvertime() {
        return overtime;
    }
    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
}
class OverTime{
    EmpolyeeDetails emp[];
    
    void set_employee_details(EmpolyeeDetails e[]){
          emp=e;
    }
    void CalculateSalary(){
        int  Overtime_salary=0;
        System.out.println("Emp id  Emp Name  working hour  Overtime  Overtimesalary\n");
        for(int i=0;i<emp.length;i++)
        {
            if(emp[i].getOvertime()>=0&&emp[i].getOvertime()<=40)
            {
                Overtime_salary=emp[i].getOvertime()*50;
            }
            System.out.printf("%d\t%s\t%d\t%d\t%d\n",emp[i].getEmp_id(),emp[i].getEmp_name(),emp[i].getTotal_working(),emp[i].getOvertime(),Overtime_salary);
        }
    }

}
public class EmployeeOvertimeApp{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        EmpolyeeDetails emp[]=new EmpolyeeDetails[5];

        for(int i=0;i<emp.length;i++)
        {
            emp[i]=new EmpolyeeDetails();
            System.out.println("Enter Empolyee id");
            int e_id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Empolyee name");
            String e_name=sc.nextLine();
            System.out.println("Enter total working hour");
            int e_total_working=sc.nextInt();
            int e_overtime=0;
            if(e_total_working>=56)
            {
             e_overtime=e_total_working-56;
            }
            emp[i].setEmp_id(e_id);
            emp[i].setEmp_name(e_name);
            emp[i].setOvertime(e_overtime);
            emp[i].setTotal_working(e_total_working);
        }
        OverTime o=new OverTime();
        o.set_employee_details(emp);
        o.CalculateSalary();
        sc.close();
         
    }
}