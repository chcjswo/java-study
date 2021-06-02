package designpattern.mediator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        System.out.println("data = " + data);
    }
}
