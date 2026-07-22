
import java.util.ArrayList;
public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added successfully!");
    }

    public void displayAllAccounts(){
        if(accounts.isEmpty()){
            System.out.println("No accounts found");
            return;
        }
        for(Account acc : accounts){
            acc.display();
            System.out.println("-------------------------");
        }
    }
    public Account findAccount(int accountNumber){
        for(Account acc : accounts){
            if(acc.accountNumber == accountNumber){
                return acc;
            }
        }
        return null;
    }
    public Account login(int accountNumber, String password){
        for(Account acc : accounts){
            if(acc.accountNumber == accountNumber &&
                 acc.password.equals(password)){
                    return acc;
                 
            }
        }
        return null;
    }
}