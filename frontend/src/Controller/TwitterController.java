package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;

import model.Twitter;
import model.TwitterEntity;
import service.TwitterEJB;
import twitter4j.TwitterException;

public class TwitterController {
	
	@EJB
	TwitterEJB twitterservice;
	
	@ManagedProperty(value="#{twitter}")
	private Twitter twitter;
	
	private TwitterHandler myHandler = new TwitterHandler();
	
	private List<TwitterEntity> twitterList = new ArrayList<>();

	public Twitter getTwitter() {
		return twitter;
	}

	public void setTwitter(List<TwitterEntity> twitterList) {
		this.twitterList = twitterList;
	}
	
	public void addNewTweets() {
	
		System.out.println("Sending Tweet to backend");
		twitterservice.addNew(twitter.getEntity());
	}
	public List<TwitterEntity> getTweetList(){
		twitterList = twitterservice.getMyTweets();
		return twitterList;
		
	}
	
	public String viewTweets() {
		return "myTweeterList.xhtml";
		
	}
	
	public void allTweets() {
		try {
			myHandler.createTweet(twitter.getTweets());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
