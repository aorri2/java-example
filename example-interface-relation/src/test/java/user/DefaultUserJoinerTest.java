package user;

import example.user.DefaultUserJoiner;
import example.user.User;
import example.user.UserDataSaver;
import example.user.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


class DefaultUserJoinerTest {
    @Mock
    Validator validator;
    @Mock
    UserDataSaver saver;
    DefaultUserJoiner joiner;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        joiner = new DefaultUserJoiner(validator, saver);
    }

    @Nested
    class testJoinUserToService {
        @Test
        void executeNormal_whenJoinUserIsValid() {
            User user = mock(User.class);
            joiner.joinUserToService(user);
            verify(validator, times(1)).checkValidity(user);
            verify(saver, times(1)).save(user);
        }
    }

}