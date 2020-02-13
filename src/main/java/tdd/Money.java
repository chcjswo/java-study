package tdd;

/**
 * Created by chcjswo on 2020-02-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiply);

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

    public abstract String currency();
}
