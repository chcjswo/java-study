package designpattern.decorator.case2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        IBeverage beverage = new Base();
        System.out.println("beverage = " + beverage.getTotalPrice());
        beverage = new Espresso(beverage);
        System.out.println("beverage = " + beverage.getTotalPrice());
        beverage = new Milk(beverage);
        System.out.println("beverage = " + beverage.getTotalPrice());
    }

}
