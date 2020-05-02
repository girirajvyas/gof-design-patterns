package io.girirajvyas.gof.designpatterns.structural.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		System.out.println(service.getTimeline("developergiri"));
		
		service.postToTimeline("developergiri", "message - that should not be tweeted");
	}
}
