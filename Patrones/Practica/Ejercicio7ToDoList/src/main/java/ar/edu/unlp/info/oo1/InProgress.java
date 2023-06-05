package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;

public class InProgress extends State{

    public InProgress(ToDoItem context) {
        super(context);
    }
    @Override
    public void start() {

    }
    @Override
    public void togglePause() {
        context.setState(new Paused(context));
    }
    @Override
    public void finish() {
        context.setState(new Finished(context));
    }
    @Override
    public Duration workedTime() {
        return Duration.between(context.getStartTime(),Instant.now());
    }
}
