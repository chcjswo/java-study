package designpattern.flyweight;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Flyweight {

    public Flyweight(String data) {
        this.data = data;
    }

    private String data;

    public String getData() {
        return data;
    }
}
