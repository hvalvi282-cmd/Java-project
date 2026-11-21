import java.util.Scanner;
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void Deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid input.");
        }
    }
    public void Withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void DisplayBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }


}
public class project{
    
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter account number: ");
     String accountNumber = sc.nextLine();
     System.out.print("Enter account holder name: ");
     String accountHolderName = sc.nextLine();
     System.out.print("Enter initial balance: ");
     double balance = sc.nextDouble();

     BankAccount acc=new BankAccount(accountNumber, accountHolderName, balance);
    
    

     while(true){
        System.out.println("\n1. Deposit");
        System.out.println("\n2. Withdraw");
        System.out.println("\n3. Display Balance");
        System.out.println("\n4. Exit");
        System.out.print("\nChoose an option: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                acc.Deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                acc.Withdraw(withdrawAmount);
                break;
            case 3:
                acc.DisplayBalance();
                break;
            case 4:
                System.out.println("Exiting...");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
}