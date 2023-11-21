package ATM_project;
import java.util.*;

public class ATM_machine {
    public static void main(String[] args) {
        int password = 7656, balance = 100000, addamount = 0, takeamount = 0;
        String name = "udhaya",option = "yes";
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert your card");
        String insert = sc.next();
        if(insert.equals(option)) {
        System.out.println("Welcome "+ name);
        System.out.println("Enter your pin");
        int pin = sc.nextInt();
        if (pin==password) {
            while (true) {
                System.out.println("Press 1 to Balance Enquiry");
                System.out.println("Press 2 to Deposit");
                System.out.println("Press 3 to Withdraw");
                System.out.println("Press 4 to print the receipt");
                System.out.println("Press 5 to Exit");
                
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your balance is: " + balance);         
                        break;
                    case 2:
                        System.out.println("Enter Deposit Amount: ");
                        addamount = sc.nextInt();
                        balance = addamount+balance;
                        System.out.println("Amount deposited successfully. Your new balance is: " + balance);
                        break;

                    case 3:
                        System.out.println("Enter the amount: ");
                        takeamount = sc.nextInt();
                        if (takeamount > balance) {
                            System.out.println("Insufficient funds. Your balance is: " + balance);
                        } else {
                        	balance = balance-takeamount;
                            System.out.println("Amount withdrawn successfully. Your new balance is: " + balance);
                        }
                        break;
                    case 4:
                    	System.out.println("Balance Deposited " + addamount);
                    	System.out.println("Balance Withdrawn " + takeamount);
                    	System.out.println("Balance Available " + balance);
                    	break;
                    case 5:
                        System.out.println("Thanks you for visiting. Have a great day!");
                    	System.exit(0);
                        break;
                    

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } 
        else{
            System.out.println("Incorrect PIN. Please try again");
        }
        
     }
        else {
        	System.out.println("Please re insert your card");
        }
    }
}
