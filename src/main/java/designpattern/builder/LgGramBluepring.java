package designpattern.builder;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-29
 **/
class LgGramBluePrint extends BluePrint  {

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    void setRam() {
        computer.setRam("16G");
    }

    @Override
    void setStorage() {
        computer.setStorage("256G SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
