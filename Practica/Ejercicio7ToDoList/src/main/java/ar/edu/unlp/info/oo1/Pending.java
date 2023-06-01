package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;

public class Pending extends State{


    public Pending(ToDoItem context) {
        super(context);
    }
    @Override
    public void start() {
        context.setState(new InProgress(context));
    }
    @Override
    public void togglePause() {
        throw new RuntimeException("ERROR. No se puede pausar una tarea no inicializada.");
    }
    @Override
    public void finish() {

    }
    @Override
    public Duration workedTime() {
        throw new RuntimeException("ERROR. La tarea nunca fue inicializada.");
    }

}
