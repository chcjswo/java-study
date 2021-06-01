package designpattern.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-01
 **/
public class FlyweightManager {

    Map<String, Flyweight> pool;

    public FlyweightManager() {
        pool = new TreeMap<>();
    }

    public Flyweight getFlyWeight(String key) {
        Flyweight flyweight = pool.get(key);

        if (flyweight == null) {
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.println("새로 생성");
        } else {
            System.out.println("재사용 " + key);
        }

        return flyweight;
    }
}
