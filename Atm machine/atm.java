import java.util.Scanner;
public class atm
{
    public static int withdraw;
    public static int balance = 10000;
    public static int deposit;
    public static int pin;
    public static int choice;
    public static int Withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw = sc.nextInt();
        if(withdraw>balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance = balance - withdraw;
            System.out.println("Amount withdrawn successfully");
        }
        return balance;
    }
    public static int Deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        deposit = sc.nextInt();
        balance = balance + deposit;
        System.out.println("Amount deposited successfully");
        return balance;
    }
    public static int Balance()
    {
        System.out.println("Your balance is "+balance);
        return balance;
    }
    public static void checkBalance()
    {
        System.out.print("Want to check your balance [Y/N]: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y')
        {
            Balance();
        }
        else
        {
            System.out.println("-------THANK YOU FOR USING OUR SERVICES-------");
        }
    }
    public static void exit()
    {  
        System.out.print("-------THANK YOU FOR USING OUR SERVICES-------");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        pin = sc.nextInt();
        if(pin == 1234)
        {
            System.out.println("------Welcome to our ATM services------");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                Withdraw();
                checkBalance();
                exit();
                break;
                case 2:
                Deposit();
                checkBalance();
                exit();
                break;
                case 3:
                Balance();
                exit();
                break;
                case 4:
                    exit();
                    System.exit(0);
                    
                    break;
                default:
                System.out.println("Invalid choice");
            }
        }
        else
        {
            System.out.println("Invalid pin");
        }
    }
}