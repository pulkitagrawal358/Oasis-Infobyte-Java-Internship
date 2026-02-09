import java.util.*;
public class ATMInterface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userID: ");
        int userId = sc.nextInt();
        System.out.println("Enter userPin: ");
        int userPin = sc.nextInt();
        System.out.println("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.println("Welcome to ATM: ");
        System.out.println("Enter User ID: ");
        int id = sc.nextInt();
        System.out.println("Enter PIN: ");
        int pin = sc.nextInt();
        if(id == userId && pin == userPin)
        {
            System.out.println("Login Successful");
            int choice = 0;
            while(choice != 5)
            {
                System.out.println("ATM MENU");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    System.out.println("No transcations made yet.");
                    break;
                    case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if(withdraw <= balance)
                    {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining Balance: " + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                    case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit successful!");
                    System.out.println("Updated Balance: " + balance);
                    break;
                    case 4:
                    System.out.print("Enter account number to transfer: ");
                    int acc = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double transfer = sc.nextDouble();
                    if(transfer <= balance)
                    {
                        balance = balance - transfer;
                        System.out.println("Transfer successful to account " + acc);
                        System.out.println("Remaining Balance: " + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                    case 5:
                    System.out.println("Thank you for using ATM!");
                    break;
                    default:
                    System.out.println("Invalid choice!");
                }
            }
        }
        else
        {
            System.out.println("Invalid User ID or PIN!");
        }
        sc.close();
    }
}