package designpattern.facade.system;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Facade {

    private HelpSystem1 helpSystem1;
    private HelpSystem2 helpSystem2;
    private HelpSystem3 helpSystem3;

    public Facade() {
        helpSystem1 = new HelpSystem1();
        helpSystem2 = new HelpSystem2();
        helpSystem3 = new HelpSystem3();
    }

    public void process() {
        helpSystem1.process();
        helpSystem2.process();
        helpSystem3.process();
    }
}
