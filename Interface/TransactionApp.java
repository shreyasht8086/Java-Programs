   //Q4. Create an interface Transaction with methods deposit() and withdraw(). Implement this interface in SavingsAccount and CurrentAccount.
interface Transaction{
   void deposit();
   void withdraw();
}
class SavingsAccount implements Transaction{
   public void deposit()
   {
      System.out.println("Iam Depsoit from Saving account");
   }
   public void withdraw()
   {
      System.out.println("Iam withdraw from Saving account");
   }
}  
class CurrentAccount implements Transaction{
   public void deposit()
   {
    System.out.println("Iam Depsoit from Current account");
   }
   public void withdraw()
   {
    System.out.println("Iam withdraw from Current account");
   }
}   
public class TransactionApp{
   public static void main(String x[])
   {
       Transaction t=new SavingsAccount();
       t.deposit();
       t.withdraw();
       Transaction t1=new CurrentAccount();
       t1.deposit();
       t1.withdraw();
      


   }

}  
