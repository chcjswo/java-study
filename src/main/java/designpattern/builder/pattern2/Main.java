package designpattern.builder.pattern2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-30
 **/
public class Main {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder
            .start()
            .setCpu("i7")
            .setRam("16G")
            .build();

        System.out.println("computer = " + computer);
    }

}
