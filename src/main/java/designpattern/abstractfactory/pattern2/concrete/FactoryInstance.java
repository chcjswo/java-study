package designpattern.abstractfactory.pattern2.concrete;

import designpattern.abstractfactory.pattern2.factory.GuiFactory;
import designpattern.abstractfactory.pattern2.linux.LinuxGuiFactory;
import designpattern.abstractfactory.pattern2.mac.MacGuiFactory;
import designpattern.abstractfactory.pattern2.win.WinGuiFactory;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class FactoryInstance {

    public static GuiFactory getFactory() {
        switch (0) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WinGuiFactory();
            default:
                return null;
        }
    }

}
