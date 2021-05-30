package designpattern.abstractfactory.pattern2;

import designpattern.abstractfactory.pattern2.factory.Button;
import designpattern.abstractfactory.pattern2.factory.GuiFactory;
import designpattern.abstractfactory.pattern2.factory.Textarea;
import designpattern.abstractfactory.pattern2.linux.LinuxGuiFactory;
import designpattern.abstractfactory.pattern2.mac.MacGuiFactory;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        GuiFactory factory = new LinuxGuiFactory();
        Button button = factory.createButton();
        Textarea textarea = factory.createTextarea();

        button.click();
        System.out.println("textarea.getText() = " + textarea.getText());

        GuiFactory macGuiFactory = new MacGuiFactory();
        Button macButton = macGuiFactory.createButton();
        Textarea macTextarea = macGuiFactory.createTextarea();

        macButton.click();
        System.out.println("macTextarea.getText() = " + macTextarea.getText());



    }

}
