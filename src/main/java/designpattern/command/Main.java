package designpattern.command;

import java.util.PriorityQueue;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("A"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("AC"));
        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABCDE"));

        queue.forEach(Command::execute);
    }

}
