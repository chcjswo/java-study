package designpattern.composite;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        Folder root = new Folder("root"),
            home = new Folder("home"),
            chcjswo = new Folder("chcjswo"),
            music = new Folder("music"),
            picture = new Folder("picture");
        File track1 = new File("track1"),
            pic1 = new File("pic1"),
            pic2 = new File("pic2");

        root.addComponent(root);
        root.addComponent(home);
        home.addComponent(chcjswo);
        chcjswo.addComponent(music);
        chcjswo.addComponent(picture);
        music.addComponent(track1);
        picture.addComponent(pic1);
        picture.addComponent(pic2);
    }

}
