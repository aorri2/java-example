package example.user;

public class PasswordPolicy implements UserPolicy {
    @Override
    public void apply(User user) {
        if (user.password().length() < 10) {
            throw new RuntimeException("Too short password");
        }
    }
}
