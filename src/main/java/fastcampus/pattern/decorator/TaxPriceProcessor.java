package fastcampus.pattern.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-16
 **/
public class TaxPriceProcessor implements PriceProcessor {
    @Override
    public Price process(Price price) {
        return new Price(price.getPrice() + ", 세금 적용 완료");
    }
}
