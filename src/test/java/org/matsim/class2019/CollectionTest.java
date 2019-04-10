package org.matsim.class2019;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionTest {
	@Test
	public void listExample(){
		List<Rectangle> mylist = new ArrayList<>();
		mylist.add(new Rectangle(10, 20));
		mylist.add(new Rectangle(10, 200));
		mylist.add(new Rectangle(10, 2));
		for(Rectangle rectangle : mylist) {
			System.out.println("The area is : " + rect.calculateArea()) ;
		}
}}
