package nextstep.ladder.view;

import nextstep.ladder.domain.LadderHeight;
import nextstep.ladder.domain.Users;

import java.util.Scanner;

public class InputView {

    public Users inputUserNames() {
        Scanner scanner = new Scanner(System.in);

        return new Users(scanner.nextLine());
    }

    public LadderHeight inputLadderHeight() {
        Scanner scanner = new Scanner(System.in);

        return new LadderHeight(scanner.nextLine());
    }
}
