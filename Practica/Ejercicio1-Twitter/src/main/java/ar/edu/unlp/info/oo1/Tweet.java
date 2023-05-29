package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tweet {

    private final int _MaxLength = 280;
    private String text;
    private Usuario owner;
    private List<ReTweet> reTweets;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Usuario getOwner() {
        return owner;
    }
    public void setOwner(Usuario owner) {
        this.owner = owner;
    }

    public Tweet(String text, Usuario owner) {
        if (text.length() > 280){
            this.text = text.substring(0,_MaxLength);
        } else {
            this.text = text;
        }
        this.owner = owner;
        this.reTweets = new ArrayList<ReTweet>();
    }

    public void addRetweet(ReTweet reTweet){
        this.reTweets.add(reTweet);
    }

}
