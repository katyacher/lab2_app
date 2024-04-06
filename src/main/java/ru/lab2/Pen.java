package ru.lab2;

public class Pen implements Item {
	private static final String type = "pen";
	
	private String color;
	
	public Pen() {
		color = "blue";
	}
	
	public Pen(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String getType() {
		return "a " + color + " " + type;
	}

}
