package designpattern.flyweight;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Main {

    public static void main(String[] args) {
        FlyweightManager factory = new FlyweightManager();
        Flyweight flyweight = factory.getFlyWeight("A");
        System.out.println("flyweight = " + flyweight);;
        flyweight = factory.getFlyWeight("A");
        System.out.println("flyweight = " + flyweight);
    }

}
