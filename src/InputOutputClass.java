import Exeptions.InsufficientFundsException;
import Exeptions.IllegalArgumentException;

import java.util.Scanner;

public class InputOutputClass {


    public static int inputStartBalance() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стартовый баланс счета: ");
        int startBalance = scanner.nextInt();
        if (startBalance < 0)
            throw new  IllegalArgumentException();

        return startBalance;
    }

    public static int inputDeposit() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите депозит для зачисления на счет: ");
        int deposit = scanner.nextInt();
        if (deposit < 0)
            throw new IllegalArgumentException();
        return deposit;
    }

    public static int takeCash(int balance) throws InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия наличных: ");
        int cash = scanner.nextInt();
        if (cash > balance)
            throw new InsufficientFundsException(balance);
        return cash;
    }
}
