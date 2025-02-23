// WAP to create the pojo class name as Student class with a following methods and data or variable/state

import java.util.*;
class Student
{
	private int id;
    private String name;
    private float per;
    private int totalFees;
    private float disFees;
    private float actualPaidFees;
	private float applicablePaidFees;

    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
	
	public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
	
	public void setPercent(int p)
    {
        per=p;
    }
    public float getPercent()
    {
        return per;
    }
    
    public void setTotalFees(int t)
    {
        totalFees=t;
    }
    int getTotalFees()
    {
        return totalFees;
    }

    public void setDisFees(float d1)
    {
        disFees=d1;
    }
    public float getDisFees()
    {
        return disFees;
    }	
	
    public void setActualPaidFees(float a)
    {
        actualPaidFees=a;
    }
    public float getActualPaidFees()
    {
        return actualPaidFees;
    }	  
    public void setApplicablePaidFees(float ap)
	{
		applicablePaidFees=ap;
	}
    public float getApplicablePaidFees()
    {
        return applicablePaidFees;
    }		
}
class DiscountFees
{
	Student sd;
	void setStudent(Student s)
	{
		sd=s;
	}
    void checkDiscountEligibility(float per)
    {
        if(per>60){
			float dis=(sd.getTotalFees())*(0.3f);
			sd.setDisFees(dis);
			sd.setApplicablePaidFees((sd.getTotalFees())-(sd.getDisFees()+(sd.getActualPaidFees())));
		}
    }	
	void showStudent()
	{
		System.out.println(sd.getId()+"\t"+sd.getName()+"\t"+sd.getPercent()+"\t"+sd.getTotalFees()+"\t"+sd.getDisFees()+"\t"+sd.getActualPaidFees()+"\t"+sd.getApplicablePaidFees());
	}	
}
public class StudentDiscount
{
	public static void main(String x[])
	{
		DiscountFees d=new DiscountFees();
		Student s1=new Student();
		s1.setId(100);
		s1.setName("ABC");
		s1.setPercent(70);
		s1.setTotalFees(25000);
		s1.setActualPaidFees(5000);
		d.setStudent(s1);
		d.checkDiscountEligibility(s1.getPercent());
		d.showStudent();
	}
}