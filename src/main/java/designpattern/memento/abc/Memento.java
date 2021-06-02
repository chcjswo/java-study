package designpattern.memento.abc;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class Memento {

    String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
