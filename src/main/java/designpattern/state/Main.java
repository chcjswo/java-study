package designpattern.state;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Main {

    public static void main(String[] args) {
        Light light = new Light();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
    }

}
