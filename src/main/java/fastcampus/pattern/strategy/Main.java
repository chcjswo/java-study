package fastcampus.pattern.strategy;

import fastcampus.stream.model.User;

import java.util.Arrays;
import java.util.List;

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
        final User user2 = new User()
            .setId(2)
            .setName("micheal")
            .setVerified(false)
            .setEmail("tony2@gmail.com")
            .setFriendUserId(Arrays.asList(201, 203, 204));
        final User user3 = new User()
            .setId(3)
            .setName("bob")
            .setVerified(true)
            .setEmail("tony3@test.com")
            .setFriendUserId(Arrays.asList(201, 202, 204));
        final User user4 = new User()
            .setId(4)
            .setName("alice")
            .setVerified(false)
            .setEmail("tony4@test.com")
            .setFriendUserId(Arrays.asList(201, 202, 203));
        final User user5 = new User()
            .setId(5)
            .setName("chcjswo")
            .setVerified(true)
            .setEmail("tony5@test.com")
            .setFriendUserId(Arrays.asList(201, 202, 203, 204));

        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        final EmailSender emailSender = new EmailSender();
        final VerifyYourEmailAddressEmailProvider verifyYourEmailAddressEmailProvider = new VerifyYourEmailAddressEmailProvider();
        final MakeMoreFriendsEmailProvider makeMoreFriendsEmailProvider = new MakeMoreFriendsEmailProvider();
        emailSender.setEmailSender(verifyYourEmailAddressEmailProvider);
        users.stream()
            .filter(user -> !user.isVerified())
            .forEach(emailSender::sendEmail);

        emailSender.setEmailSender(makeMoreFriendsEmailProvider);
        users.stream()
            .filter(user -> user.getFriendUserId().size() < 4)
            .forEach(emailSender::sendEmail);

        emailSender.setEmailSender(user -> "Play with email for " + user.getName());
        users.stream()
            .filter(User::isVerified)
            .forEach(emailSender::sendEmail);
    }
}
