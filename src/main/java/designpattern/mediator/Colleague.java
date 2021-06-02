package designpattern.mediator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public abstract class Colleague {

    private Mediator mediator;

    public boolean join(Mediator mediator) {
        if (mediator == null) {
            return false;
        }
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if (mediator != null) {
            mediator.mediate(data);
        }
    }

    public abstract void handle(String data);

}
