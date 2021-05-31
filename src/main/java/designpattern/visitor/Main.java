package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        List<Visitable> visitableList = new ArrayList<>();
        visitableList.add(new VisitableA(42));
        visitableList.add(new VisitableA(22));
        visitableList.add(new VisitableA(32));
        visitableList.add(new VisitableA(52));
        visitableList.add(new VisitableA(42));

        Visitor visitor = new VisitorA();

        for (Visitable visitable : visitableList) {
            visitable.accept(visitor);
        }

        System.out.println("visitor = " + ((VisitorA) visitor).getAgeSum());
    }

}
