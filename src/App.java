import Exeptions.IllegalArgumentException;
import Exeptions.InsufficientFundsException;
import Exeptions.FailedAttemptExeption;

public class App {
    public static void main(String[] args) {

        User user1 = new User("Boris");

        Account user1Account = user1.createAccount("main");
        user1Account.addMoney(processStartMoney());
        Account user1creditAccount = user1.createAccount("credit");
        user1creditAccount.addMoney(100000);
        Account user1debitAccount = user1.createAccount("debit");

        System.out.println("Баланс счета составляет " + user1Account.getBalance());

        user1Account.addMoney(processDeposit());

        System.out.println("Баланс счета составляет " + user1Account.getBalance());

        user1Account.delMoney(processTakeCash(user1Account));

        System.out.println("Баланс счета составляет " + user1Account.getBalance());


        System.out.println("Балланс кредитного счета составляет: " + user1creditAccount.getBalance());

        processTransaction(user1debitAccount, user1creditAccount, 500000);

        System.out.println("Балланс кредитного счета составляет: " + user1creditAccount.getBalance());

    }

    public static void processTransaction(Account a,Account b,  int money){
        try {
            Transactions.transaction(a, b, money);
        } catch (FailedAttemptExeption e){
            System.out.println(e.getMessage());
        }
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

