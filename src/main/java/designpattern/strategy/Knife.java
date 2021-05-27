package designpattern.strategy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-27
 **/
public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("검으로 공격");
    }

}
