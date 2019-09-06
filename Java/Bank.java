import java.util.Arrays;

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
    if(balance > amount){
      balance -= amount;
      System.out.println("Your new balance is " + "£" + balance);
    }else {
      System.out.println("You do not have enough funds to make this transaction");
      System.out.println("You current balance is " + "£" + balance);
      System.out.println("You can only withdraw bwtween £0 and " + "£" + balance);
    }
  }
  
 public static void main(String[] args) {
   Bank newBank = new Bank(0, "chris");
  //  newBank.withdraw(70);
  System.out.println(newBank);
  }
}