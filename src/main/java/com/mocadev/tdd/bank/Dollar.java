package com.mocadev.tdd.bank;

/**
 * Created by chcjswo on 2020-02-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiply) {
        return new Dollar(amount * multiply, currency);
    }

    public int amount() {
        return amount;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

    @Override
    public String currency() {
        return currency;
    }
}
