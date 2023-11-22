package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class UsersTest {

    @Test
    @DisplayName("사용자들을 생성할 수 있다.")
    void createUsersTest() {
        // given
        String input = "pobi,crong,honux";

        // when
        Users users = new Users(input);

        // then
        assertThat(users).isEqualTo(new Users("pobi,crong,honux"));
    }

    @Test
    @DisplayName("사용자들은 최소 두명이어야 한다.")
    void usersCountTest() {
        // given
        String input = "pobi";

        // when & then
        assertThatThrownBy(() -> new Users(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사용자는 최소 2명 이상이어야 합니다.");
    }
}
