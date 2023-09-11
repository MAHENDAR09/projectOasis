import java.util.*;
public class ATM {
public  static double Balance=1000;
public static  final int PIN=2580;
public static void main (String args[])
{
    Scanner sc=new Scanner (System.in);
    int attempts=3;
    System.out.println("WELCOME TO THE SIMPLE ATM ");
    while(attempts > 0){
        System.out.println("Enter Your PIN :");
        int enteredPin=sc.nextInt();
        if (enteredPin==PIN)
        {
            showMenu();
            break;
        }
        else{
            attempts--;
            System.out.println("Incorrect Pin. "+attempts +" Attempts Left.");
            if (attempts==0){
                System.out.println("Too Many Attempts. Exiting.");
                break;
            }
        }
    }
    sc.close();
}

public static void showMenu ()
{
    Scanner sc=new Scanner (System.in);
    while(true)
    {
        System.out.println("Menu :");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("Select an Option :");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
               {
                System.out.println("Your Balance : $"+Balance);
                break;
               }
               case 2:
               {
                System.out.println("Enter Amount to Withdraw :");
                double amountToWithdaw=sc.nextDouble();
                if (Balance>=amountToWithdaw && amountToWithdaw>0 )
                {
                    Balance-=amountToWithdaw;
                    System.out.println("Withdraw Successful. Your new Balance is $"+Balance);
                }
                else
                {
                    System.out.println("Withdraw Unsuccessful. Enter Valid Amount or Insufficent Funds");
                }
                break;
               }
               case 3:
               {
                System.out.println("Enter the Amount to Deposit :");
                double DAmount=sc.nextDouble();
                if (DAmount>0)
                {
                    Balance+=DAmount;
                    System.out.println("Deposit Successfull. Your new Balance is $:"+Balance);
                }
                else
                {
                    System.out.println("Enter valid Amount");
                }
                break;
               }
               case 4:
               {
                System.out.println("ThankYou for using Simple ATM. Have A Nice Day");
                sc.close();
                System.exit(0);

               }
               default:
               {
                System.out.println("Invalid Choice. Please Enter a Valid Choice");
               }
               
            }
    }
        
}
}