package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;

public class Finished extends State{
    private Instant endTime;

    public Finished(ToDoItem context) {
        super(context);
        this.endTime = Instant.now();
    }

    @Override
    public void start() {

    }
    @Override
    public void togglePause() {
        throw new RuntimeException("No se puede pausar una tarea finalizada.");
    }
    @Override
    public void finish() {

    }
    @Override
    public void addComment(String comment) {}
    @Override
    public Duration workedTime() {
        return Duration.between(context.getStartTime(),endTime);
    }




}

