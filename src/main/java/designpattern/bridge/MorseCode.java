package designpattern.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot();
    }

    public void dash() {
        function.dash();
    }

    public void space() {
        function.space();
    }

}
