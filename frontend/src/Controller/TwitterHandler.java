package Controller;

import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterHandler {
	
	public static Twitter getTwitterInstance() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("QhrUjF2xb9ANUiSfh2UCLRYY5")
		  .setOAuthConsumerSecret("kwyAwJKkEiU6ZKnNNI7xNlTq0bt2OulOIPjpPO8M3XBdc5w0aY")
		  .setOAuthAccessToken("88625234-YZZVYTvFNsCHlpVwVHwQJNzHslo3YM30MIexxMBDc")
		  .setOAuthAccessTokenSecret("emtbMBbYzFECKA4vKh06Aucs3iHOLkIGqUeeFaZ14DMQM");
		TwitterFactory tf = new TwitterFactory(cb.build());
		
		return tf.getInstance();
	}
		
		public static String createTweet(String tweet) throws TwitterException {
		    Twitter twitter = getTwitterInstance();
		    Status status = twitter.updateStatus(tweet);
		    System.out.print("Successful Tweet" + status );
		    return status.getText();
		}
		public static String sendDirectMessage(String recipientName, String msg) 
				  throws TwitterException {
				  
				    Twitter twitter = getTwitterInstance();
				    DirectMessage message = twitter.sendDirectMessage(recipientName, msg);
				    System.out.print("Successful Tweet" + message );
				    return message.getText();
				}

}
