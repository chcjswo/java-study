package fastcampus.pattern.templatemethod;

import fastcampus.stream.model.User;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class UserService extends AbstractUserService {
    @Override
    protected boolean validateUser(User user) {
        System.out.println("validating user " + user.getName());
        return user.getName() != null;
    }

    @Override
    protected void writeToDB(User user) {
        System.out.println("save user " + user.getName());
    }
}
