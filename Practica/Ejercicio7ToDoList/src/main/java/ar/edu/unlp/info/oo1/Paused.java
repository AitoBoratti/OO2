package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;

public class Paused extends State{

    public Paused(ToDoItem context) {
        super(context);
    }

    @Override
    public void start() {

    }

    @Override
    public void togglePause() {
        context.setState(new InProgress(context));
    }

    @Override
    public void finish() {

    }

    @Override
    public Duration workedTime() {
        return Duration.between(context.getStartTime(), Instant.now());
    }
}
