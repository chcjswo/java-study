package designpattern.decorator.case2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Milk extends AbstractAdding {

    public Milk(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }

}
