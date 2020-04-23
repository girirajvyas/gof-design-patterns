package io.girirajvyas.gof.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Giriraj_Vyas
 *
 */
public class AdapterEverydayExample {

	public static void main(String[] args) {
		Integer[] arrayOfInts = new Integer[] {21, 22, 23};
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}
}
