package io.girirajvyas.gof.designpatterns.structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("/output.txt");
		file.createNewFile();

		// Decorator
		OutputStream outputStream = new FileOutputStream(file);

		// Concrete decorator
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		dataOutputStream.writeChars("text");

		dataOutputStream.close();
		outputStream.close();

	}

}
