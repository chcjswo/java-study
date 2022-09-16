package fastcampus.pattern.strategy;

import fastcampus.stream.model.User;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class VerifyYourEmailAddressEmailProvider implements EmailProvider {
    @Override
    public String getEmail(User user) {
        return "Verify Your Email Address email for " + user.getName();
    }
}
