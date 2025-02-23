import java.util.*;
class Account{
    String accountNumber,accountHolderName;
    double balance;
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    
}

class Bank{
    Account acc[];
    Scanner sc=new Scanner(System.in);
    public void addAccount(Account account[])
    {
      this.acc=account;    
    }
    public void removeAccount(String accountNumber)
    {
        for(int i=0;i<acc.length;i++)
        {
            if(accountNumber.equals(acc[i].getAccountNumber()))
            {
                for(int j=i;j<acc.length-1;j++)
                {
                       acc[j]=acc[j+1];
                }
            }
        }
        for (int i = 0; i < acc.length-1; i++) {
            System.out.println(acc[i].getAccountNumber()+"  "+acc[i].getAccountHolderName()+"  "+acc[i].getBalance());
         }
        
    }
    public void findAccount(String accountNumber)
    {
        int flag=0,k=0;
        for(int i=0;i<acc.length;i++)
        {
            if(accountNumber.equals(acc[i].getAccountNumber()))
            {
                flag=1;
                k=i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(acc[k].getAccountNumber()+"  "+acc[k].getAccountHolderName()+"  "+acc[k].getBalance());
        }
        else
        {
            System.out.println("ACCOUNT NOT FOUND");
        }
    }
     public void totalBalance()
    {    double sum=0;
         for (int i = 0; i < acc.length; i++) {
            sum=sum+acc[i].getBalance();
         }
         System.out.println("Total Balance :"+sum);
    }
     public void displayAccounts()
     {
       for (int i = 0; i < acc.length; i++) {
          System.out.println(acc[i].getAccountNumber()+"  "+acc[i].getAccountHolderName()+"  "+acc[i].getBalance());
       }
     }
     public void deposit(double amount)
    {
        System.out.println("Enter the Account Number");
        String accountNumber=sc.nextLine();  
        for (int i = 0; i < acc.length; i++) {
            if(accountNumber.equals(acc[i].getAccountNumber()))
            {
              acc[i]=new Account(acc[i].getAccountNumber(),acc[i].getAccountHolderName(),(acc[i].getBalance()+amount));
            } 
         }
     } 
    public void withdraw(double amount)
    {
        System.out.println("Enter the Account Number");
        String accountNumber=sc.nextLine();  
        for (int i = 0; i < acc.length; i++) {
            if(accountNumber.equals(acc[i].getAccountNumber())&&amount<acc[i].getBalance())
            {
              acc[i]=new Account(acc[i].getAccountNumber(),acc[i].getAccountHolderName(),(acc[i].getBalance()-amount));
            } 
        }
    }
    public void displaySpecificAccount()
     {   System.out.println("Enter the account Number");
        String accno=sc.nextLine();
        for (int i = 0; i < acc.length; i++) {
            if(accno.equals(acc[i].getAccountNumber()))
            {
                System.out.println(acc[i].getAccountNumber()+"  "+acc[i].getAccountHolderName()+"  "+acc[i].getBalance());
            }
        }
     }

}
public class BankApp{
    public static void main(String x[])
    {
       Scanner sc=new Scanner(System.in); 
       Account acc[]=new Account[3];
       Bank bank=new Bank();
        acc[0]=new Account("1","Shreyash",50000);
        acc[1]=new Account("2","Anushka",100000);
        acc[2]=new Account("3","Bhakti",120000);
        
        int ch;
        do
        {
            System.out.println("1.Add\n2.Remove\n3.FindAccount\n4.Total Balance\n5.Display All Accounts\n6.Deposit\n7.Withdraw\n8.Display specific Account\n9.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                 bank.addAccount(acc); 
                }
                break;
                case 2:
                {
                    sc.nextLine();
                    System.out.println("Enter the Account Number");
                    String accountNumber=sc.nextLine();
                    bank.removeAccount(accountNumber);
                }
                break;
                case 3:
                {
                    sc.nextLine();
                    System.out.println("Enter the Account Number");
                    String accountNumber=sc.nextLine();
                    bank.findAccount(accountNumber);
                }
                break;
                case 4:
                {
                    bank.totalBalance();
                }
                break;
                case 5:
                {
                   bank.displayAccounts();
                }
                // break;
                case 6:
                {
                    System.out.println("Enter the Amount you want to deposit");
                    double amount=sc.nextFloat();
                    bank.deposit(amount);
                }
                break;
                case 7:
                {
                    System.out.println("Enter the Amount you want to withdraw");
                    double amount=sc.nextFloat();
                    bank.withdraw(amount);
                }
                break;
                case 8:
                {

                }
                 break
               
            }
        }while(ch>=1&&ch<9);


    }
}