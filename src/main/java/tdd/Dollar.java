package tdd;

/**
 * Created by chcjswo on 2020-02-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiply) {
        return new Dollar(amount * multiply);
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
