package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Twitter {
	
	private String tweets;
	private int tweetid;
	public int getTweetid() {
		return tweetid;
	}
	public void setTweetid(int tweetid) {
		this.tweetid = tweetid;
	}
	public String getTweets() {
		return tweets;
	}
	public void setTweets(String tweets) {
		this.tweets = tweets;
	}
	Date date = new Date(System.currentTimeMillis());
	public String getDate() {
	 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		return formatter.format(date);
	}
	public void setDate(Date date) {
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		 formatter.format(date);
		this.date = date;
	}
	
	public TwitterEntity getEntity() 
	{
		TwitterEntity twitterentity = new TwitterEntity();
		twitterentity.setTweetts(tweets);
		twitterentity.setDate(date);
		twitterentity.setId(tweetid);
		return twitterentity;
	}

}
