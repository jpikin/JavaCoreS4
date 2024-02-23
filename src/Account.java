public abstract class Account {
    private int balance;

    public abstract void addMoney(int addBalance);

    public abstract void delMoney (int cash);

    public abstract int getBalance();
}