public class Account {
    private int balance;


    public Account(int startSum){
        balance = startSum;
    }

    public void deposit(int depositSum) {
        this.balance += depositSum;
    }

    public void takeCash (int cash) {
        this.balance -= cash;
    }

    public int getBalance() {
        return  balance;
    }
}