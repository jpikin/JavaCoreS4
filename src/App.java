import Exeptions.IllegalArgumentException;
import Exeptions.InsufficientFundsException;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Boris");

        int startBalanceAccount = processStartMoney();

        Account user1Account = user1.createAccount(startBalanceAccount);

        System.out.println("Баланс счета составляет " + user1Account.getBalance());

        int deposit = processDeposit();
        user1Account.deposit(deposit);

        System.out.println("Баланс счета составляет " + user1Account.getBalance());

        int takeCash = processTakeCash(user1Account);
        user1Account.takeCash(takeCash);

        System.out.println("Баланс счета составляет " + user1Account.getBalance());
    }

    public static int processStartMoney() {
        int money = 0;
        try {
            money = InputOutputClass.inputStartBalance();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return money;
    }

    public static int processDeposit() {
        int money = 0;
        try {
            money = InputOutputClass.inputDeposit();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return money;
    }

    public static int processTakeCash(Account user1Account) {
        int money = 0;
        try {
            money = InputOutputClass.takeCash(user1Account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        return money;
    }
}

