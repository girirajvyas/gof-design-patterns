package io.girirajvyas.gof.designpatterns.structural.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterServiceImpl implements TwitterService {

	private static final String TWITTER_CONSUMER_KEY = "p6BBcuQ8iExdE1me7VUvDVIQY";
	private static final String TWITTER_SECRET_KEY = "WYBf6Sz9CQ2MgKaPQxErWIASASf4KlHGraUoI29JJoZ6eZWaBC";
	private static final String TWITTER_ACCESS_TOKEN = "15022283-85fcsL6kflLJIWJ074jQgv2C4COosDMENukPNpCF3";
	private static final String TWITTER_ACCESS_TOKEN_SECRET = "j7fjGTnkqJZyldI5ZR8EYvZfIYgeBTtRC37ZpZjyDnIYG";

	@Override
	public String getTimeline(String screenName) {

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY)
				.setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		StringBuilder builder = new StringBuilder();
		try {
			Query query = new Query(screenName);
			QueryResult result;
			do {
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
					builder.append("\n");
				}
			} while ((query = result.nextQuery()) != null);

		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return builder.toString();
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		// we aren't going to allow this
		System.out.println(message);
	}

}
