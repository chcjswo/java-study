package designpattern.builder;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-29
 **/
public class ComputerFactory {

    private BluePrint bluePrint;

    public void setBlueprint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}
