package designpattern.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class DefaultMorseCodeFunction implements MorseCodeFunction {
    @Override
    public void dot() {
        System.out.print(".");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
