package fastcampus.pattern.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-16
 **/
public class Price {

    private final String price;

    public Price(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
