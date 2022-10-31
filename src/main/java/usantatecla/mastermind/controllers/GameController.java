package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;

public class GameController extends Controller{

    public GameController(Session session) {
        super(session);
    }

    public int getAttempts(){
        return this.session.getAttemps();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.session.addProposedCombination(proposedCombination);
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public boolean isLooser() {
        return this.session.isLooser();
    }

    public ProposedCombination getProposedCombination(int i) {
        return this.session.getProposedCombination(i);
    }

    public Result getResult(int i) {
        return this.session.getResult(i);
    }

    public void continueState() {
        this.session.next();
    }
}
