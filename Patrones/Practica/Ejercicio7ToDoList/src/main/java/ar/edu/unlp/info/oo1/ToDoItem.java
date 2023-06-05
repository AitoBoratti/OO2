package ar.edu.unlp.info.oo1;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private State state;
    private Instant startTime;
    private List<String> comments;
    public ToDoItem(String name) {
        this.name = name;
        this.state = new Pending(this);
        comments = new ArrayList<String>();
    }

    public void start(){
        this.state.start();
        this.startTime = Instant.now();
    }
    public void togglePause(){
        this.state.togglePause();
    }
    public void finish(){
        this.state.finish();
    }
    public Duration workedTime(){
        return state.workedTime();
    }
    public void addComment(String comment){
        this.state.addComment(comment);
    }


    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public List<String> getComment() {
        return comments;
    }
    public void setComment(String comment) {
        this.comments.add(comment);
    }
    public Instant getStartTime() {
        return startTime;
    }
}
