package designpattern.abstractfactory.pattern2.linux;

import designpattern.abstractfactory.pattern2.factory.Button;
import designpattern.abstractfactory.pattern2.factory.GuiFactory;
import designpattern.abstractfactory.pattern2.factory.Textarea;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Textarea createTextarea() {
        return new LinuxTextarea();
    }
}
