package designpattern.abstractfactory.pattern2.mac;

import designpattern.abstractfactory.pattern2.factory.Button;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button Click");
    }
}
