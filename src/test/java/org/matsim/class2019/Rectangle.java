package org.matsim.class2019;

public class Rectangle {
	private double hight;
	private double width;
		
	public Rectangle(double width, double hight){
		this.width= width;
		this.hight= hight;
	}	
	public double calculate_area(){
		return width * hight;
	}
	}
				

