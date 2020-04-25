package io.girirajvyas.gof.designpatterns.structural.bridge.printerwithbridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String outputString = moviePrinter.print(printFormatter);
		System.out.println(outputString);
		
		Formatter htmlFormatter = new HtmlFormatter();
		String htmlString = moviePrinter.print(htmlFormatter);
		System.out.println(htmlString);
	}
}
