package example.user;

public class DefaultUserJoiner implements UserJoiner {
    private final Validator validator;
    private final UserDataSaver saver;

    public DefaultUserJoiner(Validator validator, UserDataSaver saver) {
        this.validator = validator;
        this.saver = saver;
    }

    @Override
    public void joinUserToService(User user) {
        validator.checkValidity(user);
        saver.save(user);
    }
}
