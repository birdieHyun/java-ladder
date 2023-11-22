package nextstep.ladder.view;

import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Users;

public class OutputView {

    public void askPlayerNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public void askLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public void printResult(Users users) {
        StringBuilder sb = new StringBuilder();
        sb.append("실행 결과\n");
        sb.append(users.findUsersName());

        System.out.println(sb);
    }
}
