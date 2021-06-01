package designpattern.state;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class Light {

    protected LightState lightState;

    private LightState offState = new LightState() {
        @Override
        public void on() {
            System.out.println("Light On");
            lightState = onState;
        }

        @Override
        public void off() {
            System.out.println("Light Off");
        }
    };

    private LightState onState = new LightState() {
        @Override
        public void on() {
            System.out.println("Light On");
        }

        @Override
        public void off() {
            System.out.println("Light Off");
            lightState = offState;
        }
    };

    public Light() {
        lightState = offState;
    }

    public void on() {
        lightState.on();
    }

    public void off() {
        lightState.off();
    }

}

interface LightState {
    void on();
    void off();
}
