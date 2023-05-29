package ar.edu.unlp.info.oo1;

public class VideoStreamAdapter extends Media{
    private VideoStream adaptee;

    public VideoStreamAdapter(VideoStream adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String play() {
        return adaptee.reproduce();
    }
}
