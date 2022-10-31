package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {
    
    private static final int WIDTH = 4;

    protected List<Color> colors;
    
    public Combination (){
        this.colors = new ArrayList<Color>();
    }
    
    public static int getWidth() {
        return Combination.WIDTH;
    }
}
