import java.util.Scanner;

class UserAccount{
    int accNum;
    int Balance;
    int pin;

    UserAccount(int accNum,int Balance,int pin){
        this.accNum = accNum;
        this.Balance = Balance;
        this.pin=pin;
    }
}
class AtmMachine extends UserAccount{
    
    AtmMachine(int accNum,int Balance,int pin){
        super(accNum, Balance, pin);
    }
    public void Withdraw(int amount){
        if(amount<Balance){
            Balance = Balance - amount;
            System.out.println("Your a/c no. "+accNum+" is debited for Rs."+amount+"\nYour new  balance is :"+Balance);
        }
        else{
            System.out.println("Insufficient account balance ");
        }
    }
    public void Deposit(int amount){
        Balance = Balance + amount;
        System.out.println("Your a/c no. "+accNum+" is credited for Rs."+amount+"\nYour acc's  balance is :"+Balance);
    }
    
    public void Checkbalance(){
        System.out.println("Your account balance is: "+Balance);
    }
}   
public class AtmInterface{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        

        System.out.println("Enter the account number:");
        int accNum=scn.nextInt();

        System.out.println("Enter an initial amount to deposit in your account:");
        int Balance=scn.nextInt();
        

        System.out.println("Create the atm pin:");
        int Atmpin = scn.nextInt();

        UserAccount acc = new UserAccount(accNum, Balance,Atmpin);
        

        System.out.println("BANK ACCOUNT CREATED SUCCESSFULLY ! You can use this ATM pin for any kinds of actions in the ATM");

        AtmMachine atm = new AtmMachine(accNum, Balance,Atmpin);

 
        while (true) {
            
        
        System.out.println("\n\nWHAT DO YOU WANT TO DO?\n\n");
        System.out.println("1. Withdraw Money\n2. Deposit Money\n3.Check Balance");
        System.out.print("Enter your option(1-3): ");
        int temp = scn.nextInt();

        System.out.println("Enter the Atm pin");
        int Atp = scn.nextInt();
        
        if (Atp==acc.pin){
            if(temp==1){
                System.out.println("Enter the amount to withdraw:");
                int amount=scn.nextInt();
                atm.Withdraw(amount);
            }
            else if(temp==2){
                    System.out.println("Enter the amount to Deposit:");
                    int amount=scn.nextInt();
                    atm.Deposit(amount);
            }
            else if(temp==3){
                System.out.println("Your account balance is: "+atm.Balance);
                
            }
            else{
                System.out.println("Enter the right choice !");
            }
        }
        else{
            System.out.println("Incorrect Pin");
        }
        System.out.println("Do you want to continue:");
        System.out.println("1. Yes   2. No");
        int con = scn.nextInt();
        if (con==1) {
            continue;
        }
        else{
            System.out.println("Thank you see you soon!");
            break;
        }
    }
      
        
}
}
        

