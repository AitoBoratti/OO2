package ar.edu.unlp.info.oo1;

public class ReTweet extends Tweet{
    private Tweet origin;

    public ReTweet(String text, Usuario owner, Tweet origin) {
        super(text, owner);
        this.origin = origin;
        origin.addRetweet(this);
    }

    public Tweet getOrigin() {
        return origin;
    }

}
