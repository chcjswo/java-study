package designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public abstract class Mediator {

    protected List<Colleague> colleagueList;

    public Mediator() {
        colleagueList = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        if (colleagueList != null) {
            return colleagueList.add(colleague);
        }
        return false;
    }

    abstract void mediate(String data);

}
