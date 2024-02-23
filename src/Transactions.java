import Exeptions.FailedAttemptExeption;

public class Transactions {

    public static void transaction(Account take, Account give, int money) throws FailedAttemptExeption {
        if (money > give.getBalance())
            throw new FailedAttemptExeption();
        take.addMoney(money);
        give.delMoney(money);
    }
}
