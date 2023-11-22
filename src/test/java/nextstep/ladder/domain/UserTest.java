package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class UserTest {

    @Test
    @DisplayName("사용자의 이름을 입력받아 유저 한명을 생성한다.")
    void createUserTest() {
        // given
        String input = "pobi";

        // when
        User user = new User(input);

        // then
        assertThat(user).isEqualTo(new User("pobi"));
    }

    @ParameterizedTest
    @DisplayName("사용자의 이름은 1글자 이하, 5글자 이상이면 예외를 발생시킨다.")
    @ValueSource(strings = {"", "abcdef"})
    void createUserErrorTest(String name) {

        // when & then
        assertThatThrownBy(() -> new User(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 1글자 이상, 5글자 이하만 가능합니다.");
    }
}
