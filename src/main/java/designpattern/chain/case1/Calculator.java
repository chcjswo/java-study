package designpattern.chain.case1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public abstract class Calculator {

    private Calculator nextCalculator;

    public  void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if (operator(request)) {
            return true;
        }
        return nextCalculator.process(request);
    }

    protected abstract boolean operator(Request request);

}
