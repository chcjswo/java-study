package designpattern.mediator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class ChatMediator extends Mediator {
    @Override
    void mediate(String data) {
        for (Colleague colleague : colleagueList) {
            colleague.handle(data);
        }
    }
}
