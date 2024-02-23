public class User {
    private String name;
    private Account account;

    public User(String name) {
        this.name = name;
    }

    public Account createAccount(int startSum){
        return new Account(startSum);
    }
}
