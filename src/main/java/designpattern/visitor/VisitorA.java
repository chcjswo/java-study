package designpattern.visitor;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class VisitorA implements Visitor {

    private int ageSum = 0;

    @Override
    public void visit(Visitable visitable) {
        if (visitable instanceof VisitableA) {
            ageSum += ((VisitableA) visitable).getAge();
        }
    }

    public int getAgeSum() {
        return ageSum;
    }
}
