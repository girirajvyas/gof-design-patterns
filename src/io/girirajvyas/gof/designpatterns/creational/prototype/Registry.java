package io.girirajvyas.gof.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("3 Idiots");
		movie.setPrice(10);
		movie.setRuntime("2 hrs");
		
		Book book= new Book();
		book.setTitle("Rich dad, Poor dad");
		book.setPrice(20);
		book.setNumberOfPages(200);
		
		items.put("Movie", movie);
		items.put("Book", book);
	}
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type).clone());
		} catch (CloneNotSupportedException e) {
			
		}
		return item;
	}
}
