package designpattern.factorymethod.concrete;

import designpattern.factorymethod.framework.Item;
import designpattern.factorymethod.framework.ItemCreator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-28
 **/
public class Main {

    public static void main(String[] args) {
        ItemCreator creator = new HpCreator();
        Item item = creator.Create();
        item.use();

        creator = new MpCreator();
        creator.Create();
        item.use();
    }

}
