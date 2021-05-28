package designpattern.singleton;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-28
 **/
public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println("speaker1 = " + speaker1.getVolume());
        System.out.println("speaker2 = " + speaker2.getVolume());

        speaker2.setVolume(11);

        System.out.println("speaker1 = " + speaker1.getVolume());
        System.out.println("speaker2 = " + speaker2.getVolume());

        speaker1.setVolume(21);

        System.out.println("speaker1 = " + speaker1.getVolume());
        System.out.println("speaker2 = " + speaker2.getVolume());

    }

}
