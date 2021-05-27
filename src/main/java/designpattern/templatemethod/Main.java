package designpattern.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-28
 **/
public class Main {

    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("test");
    }

}
