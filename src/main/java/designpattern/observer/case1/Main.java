package designpattern.observer.case1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        Button button = new Button();

        button.setOnClickListener(button1 -> System.out.println(button1 + " is clicked"));
        button.onClick();
    }

}

class ButtonClick implements Button.OnClickListener {
    @Override
    public void onClick(Button button) {
        System.out.println(button + " is clicked");
    }
}
