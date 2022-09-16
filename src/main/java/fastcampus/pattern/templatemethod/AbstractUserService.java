package fastcampus.pattern.templatemethod;

import fastcampus.stream.model.User;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public abstract class AbstractUserService {

    protected abstract boolean validateUser(User user);

    protected abstract void writeToDB(User user);

    public void createUser(User user) {
        if (validateUser(user)) {
            writeToDB(user);
        } else {
            System.out.println("유저 생성 실패");
        }
    }
}
