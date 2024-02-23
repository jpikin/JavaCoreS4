package Exeptions;

public class IllegalArgumentException extends Exception{

    int money;

    public IllegalArgumentException(){
        super();
    }
    @Override
    public String getMessage(){
        return "Ошибка. Ввод отрицательного числа";

    }
}
