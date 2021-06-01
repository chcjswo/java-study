package designpattern.chain.case1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class SubCalculator extends Calculator {

    @Override
    protected boolean operator(Request request) {
        if (request.getOperator().equals("-")) {
            int a = request.getA();
            int b = request.getB();
            int result = a - b;
            System.out.println("result = " + result);
            return true;
        }
        return false;
    }

}
