package designpattern.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class SoundMorseCodeFunction implements MorseCodeFunction {
    @Override
    public void dot() {
        System.out.print("뿌");
    }

    @Override
    public void dash() {
        System.out.print("삐이");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
