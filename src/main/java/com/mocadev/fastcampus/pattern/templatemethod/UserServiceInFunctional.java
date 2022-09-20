package com.mocadev.fastcampus.pattern.templatemethod;

import com.mocadev.fastcampus.stream.model.User;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class UserServiceInFunctional {

    private final Predicate<User> validateUser;
    private final Consumer<User> writeToDB;

    public UserServiceInFunctional(Predicate<User> validateUser, Consumer<User> writeToDB) {
        this.validateUser = validateUser;
        this.writeToDB = writeToDB;
    }

    public void createUser(User user) {
        if (validateUser.test(user)) {
            writeToDB.accept(user);
        } else {
            System.out.println("유저 저장 실패");
        }
    }
}
