package example.bankAccount;

//Имеется общий счет. Два пользователя раз в 1 сек. кладут 10 $ на этот счет. Реализовать потокобезопасным способом.
public class BankAccount {
    private int commonAccount = 0;

    public BankAccount(int commonAccount) {
        this.commonAccount = commonAccount;
    }

    public synchronized void put(int amount) {
        commonAccount += amount;
    }

    public synchronized int getBalance() {
        return commonAccount;
    }
}
