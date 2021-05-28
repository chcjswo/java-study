package designpattern.factorymethod.concrete;

import designpattern.factorymethod.framework.Item;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-28
 **/
public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복 물약 사용");
    }

}
