package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;

public class GameView {

    GameView(PlayController playController) {
        MessageView.TITLE.writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController.getProposedCombination(i)).write();
            new ResultView(playController.getResult(i)).writeln();
        }
        if (playController.isLooser() || playController.isWinner()) {
            playController.continueState();
        }
    }
}
