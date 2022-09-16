package fastcampus.pattern.decorator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-16
 **/
public class Main {
    public static void main(String[] args) {
        final Price originalPrice = new Price("Original Price");

        final BasicPriceProcessor basicPriceProcessor = new BasicPriceProcessor();
        final DiscountPriceProcessor discountPriceProcessor = new DiscountPriceProcessor();
        final TaxPriceProcessor taxPriceProcessor = new TaxPriceProcessor();

        final PriceProcessor priceProcessor = basicPriceProcessor
            .andThen(discountPriceProcessor)
            .andThen(taxPriceProcessor);
        final Price processPrice = priceProcessor.process(originalPrice);

        System.out.println("priceProcessor.process(originalPrice) = " + processPrice.getPrice());

        final PriceProcessor priceProcessor1 = basicPriceProcessor
            .andThen(taxPriceProcessor)
            .andThen(price -> new Price(price.getPrice() + ", 다른 기능 추가"));
        final Price process = priceProcessor1.process(originalPrice);
        System.out.println("process.getPrice() = " + process.getPrice());
    }
}
