import java.util.*;

public class ATM {
    public static void main(String[] args) {
       Bank_Account ba=new Bank_Account ();
        ba.Option ();
    }
}
class Bank {
    double balance = 0.0;
    double amount;

    void deposit() {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the amount to be  deposited: Rs.");
        this.amount = sc.nextDouble ();
        this.balance += this.amount;
        System.out.println ("Balance is:" + this.balance);
    }

    void withdraw() {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the amount to be withdraw: Rs.");
        double draw = sc.nextInt ();
        if (draw <= this.balance) {
            this.balance -= draw;
            System.out.println ("Withdrawal successful.\nCurrent Balance is: Rs." + this.balance);
        } else {
            System.out.println ("Insufficient Balance");
        }
    }

    void checkBalance() {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter your name:");
        String Name = sc.next ();

        System.out.println ("Your Name is:" + Name + "\nYour current balance is: Rs." + this.balance);
    }
}
class Bank_Account{
    void Option(){
        Bank bk=new Bank ();
        int choice = 1;
        System.out.println ("\n** ATM Machine **");
        System.out.println ("1. Withdraw");
        System.out.println ("2. Deposit");
        System.out.println ("3. Check Balance");
        System.out.println ("4. Exit");
        for (choice = 1; choice <= 3; choice++) {
            Scanner sc=new Scanner (System.in);
            System.out.print ("Enter your option:");
            choice=sc.nextInt ();
            switch (choice){
                case 1:
                    bk.deposit ();
                    break;
                case 2:
                    bk.withdraw ();
                    break;
                case 3:
                    bk.checkBalance ();
                    break;
                default:
                    System.out.println ("Invalid Option");
            }
        }
    }
}
