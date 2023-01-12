package example.user;

public class DefaultUser implements User {
    private final String email;
    private final String password;

    public DefaultUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String id() {
        return email;
    }

    @Override
    public String password() {
        return hashPassword();
    }

    private String hashPassword() {
        return "assumeThatHashPassword";
    }
}
