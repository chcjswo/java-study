package designpattern.factorymethod.framework;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-28
 **/
public abstract class ItemCreator {

    public Item Create() {
        requestItemInfo();
        Item item = createItem();
        createItemLog();
        return item;
    }

    abstract protected void requestItemInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();

}
