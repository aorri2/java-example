package example.user;

public interface Policy<T> {
    void apply(T t);
}
