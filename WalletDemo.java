class Wallet{
    private int balance;
    private static int counter = 1;
    private final int id;
    Wallet(){
        this.balance=0;
        this.id=counter;
        counter++;
    }
    Wallet(int amount){
        this.balance=amount;
        this.id=counter;
        counter++;
    }
    void deposit(int amount){
        this.balance+=amount;
        System.out.println("New balance of Wallet " + this.id + " is: " + this.balance);
    }
    void withdraw(int amount){
        if(amount>this.balance){
            System.out.println("Insufficient balance");
        }
        else{
            this.balance-=amount;
            System.out.println("New balance of Wallet " + this.id + " is: " + this.balance);
        }
    }
}
public class WalletDemo {
    public static void main(String[] args){
        Wallet balance_1 = new Wallet();
        Wallet balance_2 = new Wallet(300);
        balance_1.deposit(500);
        balance_1.withdraw(300);
        balance_2.deposit(1000);
        balance_2.withdraw(200);
        Wallet balance_3 = new Wallet(200);
        balance_3.deposit(100);
        balance_3.withdraw(500);
    }
}
