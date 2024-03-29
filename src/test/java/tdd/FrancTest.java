package tdd;

import com.mocadev.tdd.bank.Franc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chcjswo on 2020-02-10
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class FrancTest {


    @Test
    void testFranceMultiplication() {
        Franc five = new Franc(5, "CHF");
        assertEquals(new Franc(10, "CHF"), five.times(2));
        assertEquals(new Franc(15, "CHF"), five.times(3));
    }
}
