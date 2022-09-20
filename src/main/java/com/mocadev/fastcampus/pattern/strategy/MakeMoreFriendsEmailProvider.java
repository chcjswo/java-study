package com.mocadev.fastcampus.pattern.strategy;

import com.mocadev.fastcampus.stream.model.User;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class MakeMoreFriendsEmailProvider implements EmailProvider {
    @Override
    public String getEmail(User user) {
        return "Make More Friends email for " + user.getName();
    }
}
