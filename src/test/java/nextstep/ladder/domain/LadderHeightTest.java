package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class LadderHeightTest {

    @Test
    @DisplayName("사다리의 높이를 입력받을 수 있다.")
    void createLadderHeightTest() {
        // given
        String input = "5";

        // when
        LadderHeight ladderHeight = new LadderHeight(input);

        // then
        assertThat(ladderHeight).isEqualTo(new LadderHeight("5"));
    }

    @Test
    @DisplayName("사다리 높이가 1 이하일 경우 예외가 발생한다.")
    void ladderHeightMinTest() {
        // given
        String input = "1";

        // when & then
        assertThatThrownBy(() -> new LadderHeight(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사다리의 높이는 2 이상이어야 합니다.");
    }

    @Test
    @DisplayName("사다리 높이는 숫자만 입력할 수 있다.")
    void heighFormatTest() {
        // given
        String input = "a";

        // when & then
        assertThatThrownBy(() -> new LadderHeight(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사다리의 높이는 숫자만 입력할 수 있습니다.");
    }
}
