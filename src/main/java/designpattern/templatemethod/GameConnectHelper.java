package designpattern.templatemethod;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog http://mocadev.tistory.com
 * @github http://github.com/chcjswo
 * @since 2021-05-28
 **/
public abstract class GameConnectHelper {

    protected abstract String doSecurity(String str);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String  ino);

    // template method
    public String requestConnection(String encodeInfo) {
        String decodeInfo = doSecurity(encodeInfo);

        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String username = "username";
        int auth = authorization(username);

        switch (auth) {
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("무료 회원");
                break;
            case 2:
                System.out.println("유료 회원");
                break;
        }

        return connection(decodeInfo);
    }

}
