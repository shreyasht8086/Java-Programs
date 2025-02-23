import java.util.*;
class Voter{
    private int id,age,ward;
    private String name;

    void set_id(int i)
    {
        id=i;
    }
    void set_age(int ag)
    {
        age=ag;
    }
    void set_ward(int w)
    {
        ward=w;
    }
    void set_name(String s)
    {
        name=s;
    }
    int get_id()
    {
        return id;
    } 
    int get_age()
    {
        return age;
    }
    int get_ward()
    {
        return ward;
    }
    String get_name()
    {
        return name;
    }

}
class VoterDetails{
    Voter vt[];
    void set_details(Voter v[])
    {
        vt=v;
    }
    void show_voter_details()
    {   System.out.printf("-------------Voter Details---------------------------------\n"); 
        System.out.printf("ID\tName\t\t\tWard Number\tAge\t\n");
        for(int i=0;i<vt.length;i++)
        {
            
            System.out.printf("%d\t%s\t\t%d\t\t%d\t\n",vt[i].get_id(),vt[i].get_name(),vt[i].get_ward(),vt[i].get_age());
        }
        System.out.printf("-------------Voter Details---------------------------------");
    }

}
public class VoterApp{
    public static  void main(String x[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the size of Data\n");
        int size=scan.nextInt();
        Voter vote[]=new Voter[size];
        VoterDetails vote_details=new VoterDetails();
        int i;
        for(i=0;i<vote.length;i++)
        {
            vote[i]=new Voter();
            System.out.printf("----Enter the Details of voter----\n");
            System.out.printf("Enter the voter id\n");
            int id=scan.nextInt();
            scan.nextLine();
            System.out.printf("Enter name of voter\n");
            String name=scan.nextLine();
            System.out.printf("Enter the ward number\n");
            int ward=scan.nextInt();
            System.out.printf("Enter the age of voter\n");
            int age=scan.nextInt();

            vote[i].set_id(id);
            vote[i].set_name(name);
            vote[i].set_age(age);
            vote[i].set_ward(ward);
        } 
        vote_details.set_details(vote);
        vote_details.show_voter_details();
    }
}