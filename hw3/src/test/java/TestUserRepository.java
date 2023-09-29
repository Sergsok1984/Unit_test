import org.junit.jupiter.api.Test;
import tdd.User;
import tdd.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUserRepository {
    @Test
    public void testLogoutUser() {
        User first = new User("Sergey", "admin", true);
        first.authenticate("Sergey", "admin");
        User second = new User("Petr", "qwerty", false);
        second.authenticate("Petr", "qwerty");
        User third = new User("Fedor", "12345", false);
        third.authenticate("Fedor", "12345");

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(first);
        userRepository.addUser(second);
        userRepository.addUser(third);

        userRepository.logoutUser();

        assertThat(userRepository.getData().get(0)).isEqualTo(first);
    }
}
