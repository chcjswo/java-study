package designpattern.facade.system;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
class HelpSystem3 {

    public HelpSystem3() {
        System.out.println("Call Constructor: " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call process: " + getClass().getSimpleName());
    }
}
