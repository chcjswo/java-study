package designpattern.builder;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-29
 **/
public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBluePrint());
//        factory.setBlueprint(new MacBluepring());
//        factory.setBlueprint(new SonyBluepring());
        Computer computer = factory.make();

//        Computer computer = new Computer("i7", "16g", "1t ssd");
        System.out.println("computer = " + computer);
    }

}
