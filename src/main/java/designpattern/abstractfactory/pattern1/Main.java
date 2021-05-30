package designpattern.abstractfactory.pattern1;

import designpattern.abstractfactory.pattern1.factory.BikeFactory;
import designpattern.abstractfactory.pattern1.factory.Body;
import designpattern.abstractfactory.pattern1.factory.Wheel;
import designpattern.abstractfactory.pattern1.sam.SamFactory;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println("body = " + body.getClass());
        System.out.println("wheel = " + wheel.getClass());
    }

}
