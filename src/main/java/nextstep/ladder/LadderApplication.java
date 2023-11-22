package nextstep.ladder;

import nextstep.ladder.controller.LadderController;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.OutputView;

public class LadderApplication {

    public static void main(String[] args) {
        LadderController ladderController = new LadderController(
                new OutputView(),
                new InputView()
        );

        ladderController.playGame();
    }
}
