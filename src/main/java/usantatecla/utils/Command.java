package usantatecla.utils;

public abstract class Command extends Console {

    protected String title;
    
    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute();

    protected abstract boolean isActive();

    String getTitle() {
        return this.title;
    }
}