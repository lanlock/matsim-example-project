package org.matsim.class2019;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testcalculateArea() {
		Rectangle rect = new Rectangle(10, 20);
		
		double area = rect.calculate_area();
		System.out.println("The Area is " + area);
		
		assertEquals(200, area, 0.0001);
	}

}
