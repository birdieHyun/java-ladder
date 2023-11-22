package nextstep.ladder.domain;

import java.util.Objects;

public class LadderHeight {

    private static final int MIN_HEIGHT = 2;
    private final int value;

    public LadderHeight(String value) {

        int height = parseHeight(value);
        validateLadderHeight(height);

        this.value = height;
    }

    private void validateLadderHeight(int height) {
        if (height < MIN_HEIGHT) {
            throw new IllegalArgumentException("사다리의 높이는 2 이상이어야 합니다.");
        }
    }

    private int parseHeight(String value) {
        int height;
        try{
            height = Integer.parseInt(value);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("사다리의 높이는 숫자만 입력할 수 있습니다.");
        }
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderHeight that = (LadderHeight) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
