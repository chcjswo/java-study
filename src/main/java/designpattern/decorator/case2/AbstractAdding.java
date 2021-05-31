package designpattern.decorator.case2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public abstract class AbstractAdding implements IBeverage {

    private IBeverage beverage;

    public AbstractAdding(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getTotalPrice() {
        return beverage.getTotalPrice();
    }

    public IBeverage getBeverage() {
        return beverage;
    }
}
