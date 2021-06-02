package designpattern.observer.case1;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Button {

    public void onClick() {
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public interface OnClickListener {
        void onClick(Button button);
    }

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
