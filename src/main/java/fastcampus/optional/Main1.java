package fastcampus.optional;

import fastcampus.stream.model.User;

import java.util.Optional;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-11
 **/
public class Main1 {
    public static void main(String[] args) {
        final User user1 = new User().setId(1).setName("tony1").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1).setName("tony2").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(2).setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(3).setName("tony4").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(4).setVerified(true).setEmail("tony5@test.com");

        System.out.println(userEquals(user1, user2));
        System.out.println(userEquals(user3, user4));
        System.out.println(userEquals(user3, user5));

        final Optional<User> user = Optional.ofNullable(maybeGetUser(true));
        System.out.println("user = " + user);
        user.ifPresent(u -> System.out.println("user = " + u));
        final Optional<User> user11 = Optional.ofNullable(maybeGetUser(false));
        System.out.println("user11 = " + user11);
    }

    public static boolean userEquals(User u1, User u2) {
        System.out.println("u1.getName() = " + u1.getName());
        System.out.println("u1.getName() = " + u2.getName());
        return  u1.getId() == u2.getId() && u1.getName().equals(u2.getName());
    }

    public static User maybeGetUser(boolean returnUser) {
        if (returnUser) {
            return new User()
                .setId(1)
                .setName("tony1")
                .setVerified(true)
                .setEmail("tony1@test.com");
        }
        return null;
    }
}
