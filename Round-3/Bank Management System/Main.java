import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        while(true){
            System.out.println("---------Bank Menu---------");
            System.out.println("1. Create Account");
            System.out.println("2. Show All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Login");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    Account acc = new Account();

                    System.out.print("Enter Account Number: ");
                    acc.accountNumber = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.print("Enter Account Holder Name: ");
                    acc.accountHolderName = sc.nextLine();

                    System.out.print("Enter Password: ");
                    acc.password = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    acc.balance = sc.nextDouble();

                    bank.addAccount(acc);
                    
                    
                    break;

                case 2:
                   bank.displayAllAccounts();
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = sc.nextInt();

                    Account found = bank.findAccount(accountNumber);

                    if (found != null) {
                        System.out.println("\n===== Account Found =====");
                        found.display();
                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Password: ");
                    String pass = sc.nextLine();

                    Account login = bank.login(accNo, pass);

                    if(login != null){

                        System.out.println("Login Successful.");
                        System.out.println("Welcome, " + login.accountHolderName );
                        boolean id = true;

                        while(id){
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Logout");

                        System.out.print("Enter your choice: ");
                        int loginChoice = sc.nextInt();

                        switch(loginChoice){
                            case 1:
                                System.out.print("Enter amount to deposit: ");
                                double depositAmount = sc.nextDouble();
                                login.deposit(depositAmount);
                                break;
                            case 2:
                                System.out.print("Enter amount to withdraw: ");
                                double withdrawAmount = sc.nextDouble();
                                login.withdraw(withdrawAmount);
                                break;
                            case 3:
                                System.out.println("Current Balance: $" + login.balance);   
                                break;
                            case 4:
                                System.out.println("Logged out successfully.");
                                id = false; 
                                break;
                        

                        default:
                            System.out.println("Invalid choice! Please try again.");
                        
                        }

                    }
                }
                    else{
                        System.out.println("Login Failed.");
                    }
                case 5:
                    System.out.println("Thank You! Visit Again.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        }

    }
}