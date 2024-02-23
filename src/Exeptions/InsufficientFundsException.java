package Exeptions;

public class InsufficientFundsException extends Exception{
    int balance;
    public InsufficientFundsException(int balance){
        super();
        this.balance = balance;

    }
    @Override
    public String getMessage() {
        return String.format("Недостаточно средств на балансе.\n Ваш текущий баланс составляет %d ",balance);
        }
    }

