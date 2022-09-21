package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.models.Session;

public class PlayController extends AcceptorController {

	private GameController gameController;
	private UndoController undoController;
	private RedoController redoController;

    public PlayController(Session session) {
		super(session);
		this.gameController = new GameController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void undo() {
		this.undoController.undo();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean undoable(){
		return this.undoController.undoable();
	}

	public boolean redoable(){
		return this.redoController.redoable();
	}

	public boolean isWinner() {
		return this.gameController.isWinner();
	}

	public boolean isLooser() {
		return this.gameController.isLooser();
	}

	public int getAttempts() {
		return this.gameController.getAttempts();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.gameController.getProposedCombination(i);
	}

	public Result getResult(int i) {
		return this.gameController.getResult(i);
	}

	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.gameController.addProposedCombination(proposedCombination);
	}

	public void continueState() {
		this.gameController.continueState();
	}

}