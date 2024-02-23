package Exeptions;

public class FailedAttemptExeption extends Exception{
    int money;

    public FailedAttemptExeption(){
        super();
    }
    @Override
    public String getMessage(){
        return "Ошибка. Неудачная транзакция";

    }
}
