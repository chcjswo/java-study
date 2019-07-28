package tdd;

/**
 * Created by chcjswo on 2019-07-28
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }
}
