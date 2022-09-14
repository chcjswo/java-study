package fastcampus.stream.partitioningby;

import fastcampus.stream.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-15
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(1, 4, 5, 13, 2, 1001, 21, 24, 55, 66, 2321, 343, 21345, 1001);
        final Map<Boolean, List<Integer>> collect = integers.stream()
            .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("collect = " + collect);

        final User user1 = new User().setId(1).setName("tony1").setFriendUserId(Arrays.asList(201, 202));
        final User user2 = new User().setId(2).setName("tony2").setFriendUserId(Arrays.asList(201, 203, 204));
        final User user3 = new User().setId(3).setName("tony3").setFriendUserId(Arrays.asList(201, 202, 204));
        final User user4 = new User().setId(4).setName("tony4").setFriendUserId(Arrays.asList(201, 202, 203));
        final User user5 = new User().setId(5).setName("tony5").setFriendUserId(Arrays.asList(201, 202, 203, 204));
        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        final Map<Boolean, List<User>> collect1 = users.stream()
            .collect(Collectors.partitioningBy(x -> x.getFriendUserId().size() < 4));
        System.out.println("collect1 = " + collect1);

        for (User user : collect1.get(true)) {
            System.out.println("less friends = " + user);
        }
        for (User user : collect1.get(false)) {
            System.out.println("many friends = " + user);
        }
    }
}
