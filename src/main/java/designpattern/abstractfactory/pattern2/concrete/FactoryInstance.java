package designpattern.abstractfactory.pattern2.concrete;

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

class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Textarea createTextarea() {
        return new LinuxTextarea();
    }
}

class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux Button Click");
    }
}

class LinuxTextarea implements Textarea {
    @Override
    public String getText() {
        return "Linux Textarea";
    }
}

class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Textarea createTextarea() {
        return new MacTextarea();
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button Click");
    }
}

class MacTextarea implements Textarea {
    @Override
    public String getText() {
        return "Mac Textarea";
    }
}

class WinGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Textarea createTextarea() {
        return new WinTextarea();
    }
}

class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Win Button Click");
    }
}

class WinTextarea implements Textarea {
    @Override
    public String getText() {
        return "Win Textarea";
    }
}

