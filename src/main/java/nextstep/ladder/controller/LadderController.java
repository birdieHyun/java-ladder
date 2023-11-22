package nextstep.ladder.controller;

import nextstep.ladder.domain.LadderHeight;
import nextstep.ladder.domain.Users;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.OutputView;

public class LadderController {

    private final OutputView outputView;
    private final InputView inputView;

    public LadderController(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void playGame() {
        outputView.askPlayerNames();
        Users users = inputView.inputUserNames();

        outputView.askLadderHeight();
        LadderHeight height = inputView.inputLadderHeight();

    }
}
