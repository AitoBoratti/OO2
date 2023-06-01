package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;

public abstract class State {
    protected ToDoItem context;

    public State(ToDoItem context) {
        this.context = context;
    }

    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();
    public void addComment(String comment){
        context.setComment(comment);
    }
    public abstract Duration workedTime();

}
