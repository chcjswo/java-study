package com.mocadev.fastcampus.pattern.templatemethod;

import com.mocadev.fastcampus.stream.model.User;

import java.util.Arrays;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class Main {
    public static void main(String[] args) {
        final User user1 = new User()
            .setId(1)
            .setName("tony")
            .setVerified(true)
            .setEmail("tony1@test.com")
            .setFriendUserId(Arrays.asList(201, 202));

        final UserService userService = new UserService();
        final InternalUserService internalUserService = new InternalUserService();
        userService.createUser(user1);
        internalUserService.createUser(user1);

        final UserServiceInFunctional userServiceInFunctional = new UserServiceInFunctional(user -> {
            System.out.println("Functional validating user " + user.getName());
            return user.getName() != null;
        }, user -> System.out.println("Functional save user " + user.getName()));
        userServiceInFunctional.createUser(user1);
    }
}
