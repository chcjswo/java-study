package designpattern.command;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class StringPrintCommand implements Command {

    private String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println("string = " + this.string);
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand command = (StringPrintCommand) o;
        return this.string.length() - command.string.length();
    }
}
