package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Users {

    private static final int MINIMUM_USERS_COUNT = 2;
    private static final String DELIMITER = ",";
    private final List<User> value;

    public Users(String value) {

        String[] split = value.split(DELIMITER);

        validateUsersCount(split);

        this.value = Arrays.stream(split)
                .map(User::new)
                .collect(Collectors.toList());
    }

    private void validateUsersCount(String[] split) {
        if (split.length < MINIMUM_USERS_COUNT) {
            throw new IllegalArgumentException("사용자는 최소 2명 이상이어야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(value, users.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
