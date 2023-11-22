package nextstep.ladder.domain;

import java.util.Objects;

public class User {

    private final String name;

    public User(String name) {

        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("이름은 1글자 이상, 5글자 이하만 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
