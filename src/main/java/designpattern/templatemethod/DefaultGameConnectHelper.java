package designpattern.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-28
 **/
public class DefaultGameConnectHelper extends GameConnectHelper {
    @Override
    protected String doSecurity(String str) {
        System.out.println("강화된 알고리즘 decode");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인");
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("권한 확인");
        System.out.println("시간 체크");
        return 0;
    }

    @Override
    protected String connection(String ino) {
        System.out.println("마지막 접속 단계");
        return null;
    }

    @Override
    public String requestConnection(String encodeInfo) {
        return super.requestConnection(encodeInfo);
    }
}
