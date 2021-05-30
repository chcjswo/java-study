package designpattern.abstractfactory.sam;

import designpattern.abstractfactory.factory.BikeFactory;
import designpattern.abstractfactory.factory.Body;
import designpattern.abstractfactory.factory.Wheel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
