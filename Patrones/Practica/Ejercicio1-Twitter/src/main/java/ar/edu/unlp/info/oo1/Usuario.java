package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<Tweet>();
    }

    public String getScreenName() {
        return screenName;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void makeTweet(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte el texto de su tweet, no mayor a 280 caracteres: ");
        String text = scanner.nextLine();
        while (text.length()<1) {
            System.out.println("Su tweet no tiene texto, vuelva a ingresarlo. Si desea cancelar su escritura, escriba la palabra clave EXIT");
            text = scanner.nextLine();
            if (text.equals("EXIT")){
                return;
            }
        }
        tweets.add(new Tweet(text, this));
        scanner.close();
    }

    public void makeReTweet(Tweet tweet){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte el texto de su tweet, no mayor a 280 caracteres: ");
        String text = scanner.nextLine();
        while (text.length()<1) {
            System.out.println("Su tweet no tiene texto, vuelva a ingresarlo. Si desea cancelar su escritura, escriba la palabra clave EXIT");
            text = scanner.nextLine();
            if (text.equals("EXIT")){
                return;
            }
        }
        tweets.add(new ReTweet(text, this, tweet));
        scanner.close();
    }

    public void eliminateAllTweets (){
        tweets.clear();
    }

}
