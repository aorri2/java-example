package example.user;

public class IdPolicy implements UserPolicy {
    private final UserDataLoader loader = null;

    @Override
    public void apply(User user) {
        if (user.id().length() < 5) {
            throw new RuntimeException("Too short id.");
        } else if (loader.findById(user.id()) != null) {
            throw new RuntimeException("Id Already Exist.");
        }
    }
}
