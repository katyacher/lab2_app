package ru.lab2;

public class Pencil implements Item {
	
	private static final String type = "pencil";
	
	private String material;
	
	public Pencil() {
		material = "green";
	}
	
	public Pencil(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	@Override
	public String getType() {
		return "a " + material + " " + type;
	}
}
