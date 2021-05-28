package designpattern.prototype;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-29
 **/
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(2, 3, 5);
        Circle circle2 = circle1.copy();
        System.out.println("circle1 = " + circle1);
        System.out.println("circle2 = " + circle2);
    }

}
