import java.util.*;
class Ward{
       private int ward_id;
       String ward_name;
       Vote voter[];
       void set_ward_id(int i)
       {
           ward_id=i;
       }
       int get_ward_id()
       {
        return ward_id;
       }
       void set_ward_name(String s)
       {
          ward_name=s;
       }
       String get_ward_name()
       {
         return ward_name;
       }
       void set_voter(Vote vt[])
       {
           voter=vt;
       }
       Vote[] get_voter()
       {
         return voter;
       }


}
class Vote{
     private int voter_id,voter_age ;
     private String  voter_name;

     void set_voter_id(int i)
     {
        voter_id=i;
     }
     void set_voter_name(String s)
     {
        voter_name=s;
     }
     void set_voter_age(int ag)
     {
        voter_age=ag;
     }
     int get_voter_id()
     {
        return voter_id;
     }
     int get_voter_age()
     {
        return voter_age;
     }
     String get_voter_name()
     {
        return voter_name;
     }
}
class FindVoter{
    private Ward[] wards;

    void set_ward(Ward[] wd) {
        wards = wd;
    }

    void show_voter() {
        int i,vote_count = 0;
        System.out.printf("\t\n");
        for (i=0;i<wards.length;i++)
         {
            System.out.printf("************************************Voter Details**********************************\n");
            System.out.printf("Ward id:%d\tWard_name:%s\n", wards[i].get_ward_id(), wards[i].get_ward_name());
            System.out.printf("-----------------------------------------------------------------------------------\n");
            Vote[] voter = wards[i].get_voter();
            System.out.printf("Voter id\tVoter Name\tVoter Age\n");
            for (int j=0;j<voter.length;j++) {
                System.out.printf("%d\t\t  %s\t\t%d\n", voter[j].get_voter_id(), voter[j].get_voter_name(), voter[j].get_voter_age());
                if(voter[j].get_voter_age()>=18)
                {
                vote_count++;
                }
            }
            System.out.printf("************************************Voter Details**********************************\n");
        }
        System.out.printf("Total Vote Count = %d\n", vote_count);
    }
}
public class VoteingMachineApp{
    public static void main (String x[])
    {    Scanner sc=new Scanner(System.in);
         System.out.printf("Enter total wards\n");
         int wd_size=sc.nextInt();
         Ward wd[]=new Ward[wd_size];
         for(int i=0;i<wd.length;i++)
         {
              wd[i]=new Ward();
              System.out.printf("Enter the ward id\n");
              int wd_id=sc.nextInt();
              sc.nextLine();
              System.out.printf("Enter the ward name\n");
              String wd_name=sc.nextLine();
              wd[i].set_ward_id(wd_id);
              wd[i].set_ward_name(wd_name);

              System.out.printf("Size of Voter data\n");
              int vt_size=sc.nextInt();
              Vote vt[]=new Vote[vt_size];
              for(int j=0;j<vt.length;j++)
              {
                 vt[j]=new Vote();
                 System.out.printf("Enter the Voter id\n");
                 int vt_id=sc.nextInt();
                 sc.nextLine();
                 System.out.printf("Enter the voter name\n");
                 String vt_name=sc.nextLine();
                 System.out.printf("Enter the Voter age\n");
                 int vt_age=sc.nextInt();

                 vt[j].set_voter_id(vt_id);
                 vt[j].set_voter_name(vt_name);
                 vt[j].set_voter_age(vt_age);
              }
            wd[i].set_voter(vt);  
         }

         FindVoter fv=new FindVoter();
         fv.set_ward(wd);
         fv.show_voter();
         sc.close();
    }
}
