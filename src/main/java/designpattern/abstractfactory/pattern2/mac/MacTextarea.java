package designpattern.abstractfactory.pattern2.mac;

import designpattern.abstractfactory.pattern2.factory.Textarea;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class MacTextarea implements Textarea {
    @Override
    public String getText() {
        return "Mac Textarea";
    }
}
