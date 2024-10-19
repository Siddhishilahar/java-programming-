
class SavingAccount
{
   private  double savingBalance;
   private static double annualInterestRate;

   public SavingAccount(double balance)
   {
    this.savingBalance = balance;
   }

   public void calculateMonthlyInterest()
   {
    double monthlyInterest = (savingBalance * annualInterestRate /12)/100;
    savingBalance += monthlyInterest;
   }

   public void printSavingBalance()
   {
    System.out.println("Saving balance: Rs. %.2f%n" +savingBalance);
   }

   public static void modifyInterestRate(double newRate)
   {
    annualInterestRate = newRate;
   }

   public static void main(String[] args)
   {
    SavingAccount acc1 = new SavingAccount(2000.00);
    SavingAccount acc2 = new SavingAccount(3000.00);

    //set annualinterest rate 4%
    SavingAccount.modifyInterestRate(4.0);

    //calculate nd print monthly interest for the first time
    System.out.println("Balance with 4% interest rate:");
    acc1.calculateMonthlyInterest();
    acc1.printSavingBalance();
    acc2.calculateMonthlyInterest();
   acc2.printSavingBalance();

   //set annualinterest rate 5%
   System.out.println("Balance with 5% interest rate:");
   acc1.calculateMonthlyInterest();
    acc1.printSavingBalance();
    acc2.calculateMonthlyInterest();
   acc2.printSavingBalance();
   }
}