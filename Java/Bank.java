public class Bank{
  double deposit;
  String accontOwnerName;
  double balance;

  public Bank(double initialDeposit, String name){
    deposit = initialDeposit;
    accontOwnerName = name;
  }

  public void updateBalance(double amount){
    balance += amount;
    System.out.println("Your new balance is " + "£" + balance);
  }

  public void withdraw(double amount){
    balance -= amount;
    System.out.println("Your new balance is " + "£" + balance);
  }

 public static void main(String[] args) {
   Bank newBank = new Bank(0, "chris");
   newBank.updateBalance(20);
  }
}