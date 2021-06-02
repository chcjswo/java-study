package designpattern.memento;

import designpattern.memento.abc.Memento;
import designpattern.memento.abc.Originator;

import java.util.Stack;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-03
 **/
public class Main {

    public static void main(String[] args) {
        Stack<Memento> stack = new Stack<>();

        Originator originator = new Originator();
        originator.setState("state 1");
        stack.push(originator.createMemento());

        originator.setState("state 2");
        stack.push(originator.createMemento());

        originator.setState("state 3");
        stack.push(originator.createMemento());

        originator.setState("state final");
        stack.push(originator.createMemento());

        originator.restoreMemento(stack.pop());
        System.out.println("originator = " + originator.getState());

        originator.restoreMemento(stack.pop());
        System.out.println("originator = " + originator.getState());

        originator.restoreMemento(stack.pop());
        System.out.println("originator = " + originator.getState());

        originator.restoreMemento(stack.pop());
        System.out.println("originator = " + originator.getState());
    }

}
