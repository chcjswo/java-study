package designpattern.Adapter;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-27
 **/
public class Main {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(80f));
    }

}
