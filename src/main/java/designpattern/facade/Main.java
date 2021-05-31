package designpattern.facade;

import designpattern.facade.system.Facade;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }

}
