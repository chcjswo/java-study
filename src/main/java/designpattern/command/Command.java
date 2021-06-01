package designpattern.command;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public interface Command extends Comparable<Command> {

    void execute();

}
