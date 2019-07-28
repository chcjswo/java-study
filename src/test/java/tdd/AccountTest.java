package tdd;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by chcjswo on 2019-07-28
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(10000);
    }

    @Test
    public void testAccount() throws Exception {
    }

    @Test
    public void testGetBalance() throws Exception {
        assertEquals("10000원 계좌 생성 후 잔고 조회 ", 10000, account.getBalance());

        account = new Account(1000);
        assertEquals("1000원 계좌 생성 후 잔고 조회 ", 1000, account.getBalance());

        account = new Account(0);
        assertEquals("0원 계좌 생성 후 잔고 조회 ", 0, account.getBalance());
    }

    @Test
    public void testDeposit() throws Exception {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
}
