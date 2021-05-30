package designpattern.abstractfactory.pattern2.factory;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public interface GuiFactory {

    Button createButton();
    Textarea createTextarea();

}
