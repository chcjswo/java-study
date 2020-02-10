package tdd;

/**
 * Created by chcjswo on 2020-02-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiply) {
        return new Franc(amount * multiply);
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }
}
