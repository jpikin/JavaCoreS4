import java.util.ArrayList;

public class User {
    private final String name;

    private ArrayList<Account> accounts;

    public User(String name) {
        this.name = name;
    }

    public Account createAccount(String account){
        switch (account) {
            case "credit":
                return new CreditAcciunt();
            case "debit":
                return new DebitAccount();
        }
        return new DebitAccount();
    }

    /**
     * Добавляет в список счетов новый счет.
     */
    public void addAccount(Account a){
        this.accounts.add(a);
    }
}
