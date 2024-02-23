public class CreditAcciunt extends Account{
    private int balance;

    public CreditAcciunt(){
        this.balance = 0;
    }


    public void addMoney(int addBalance) {
        balance += addBalance;
    }

    public void delMoney (int cash) {
        this.balance -= cash;
    }
    public int getBalance() {
        return  this.balance;
    }
}
