package designpattern.chain.case1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();

        plus.setNextCalculator(sub);

        Request request1 = new Request(1, 2, "+");
        Request request2 = new Request(10, 2, "-");

        plus.process(request1);
        plus.process(request2);
    }

}
