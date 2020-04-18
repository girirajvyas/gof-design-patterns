package io.girirajvyas.gof.designpatterns.creational.factory;

public class Blog extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
