package designpattern.bridge;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
        code.g().a().r().a().m();
    }

}
