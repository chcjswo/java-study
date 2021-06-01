package designpattern.proxy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        Subject real = new RealSubject();
        Subject proxy1 = new Proxy(real);
        Subject proxy2 = new Proxy(real);

        proxy1.action1();
        proxy2.action1();

        proxy1.action2();
        proxy2.action2();
    }

}
