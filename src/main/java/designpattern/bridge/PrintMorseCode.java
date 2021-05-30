package designpattern.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class PrintMorseCode extends MorseCode {

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    public PrintMorseCode g() {
        dash();
        dash();
        dot();
        space();
        return this;
    }

    public PrintMorseCode a() {
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode r() {
        dot();
        dash();
        dot();
        space();
        return this;
    }

    public PrintMorseCode m() {
        dash();
        dash();
        space();
        return this;
    }

}
