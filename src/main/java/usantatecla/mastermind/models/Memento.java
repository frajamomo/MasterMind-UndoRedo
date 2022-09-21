package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int attemps;

    Memento(List<ProposedCombination> proposedCombinations, List<Result> results, int attemps ){
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
        this.results = new ArrayList<>(results);
        this.attemps = attemps;
    }

    List<ProposedCombination> getProposedCombinations() {
        return this.proposedCombinations;
    }

    List<Result> getResults(){
        return this.results;
    }

    int getAttempts(){
        return this.attemps;
    }
    
}
