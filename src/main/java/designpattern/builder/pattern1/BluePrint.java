package designpattern.builder.pattern1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-29
 **/
public abstract class BluePrint {

    abstract void setCpu();
    abstract void setRam();
    abstract void setStorage();

    public abstract Computer getComputer();
}
