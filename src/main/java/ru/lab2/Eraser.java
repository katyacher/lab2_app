package ru.lab2;

public class Eraser implements Item {
	private static final String type = "eraser";
	
	private int width;
	private int height;
	
	public Eraser() {
		width = 5;
		height = 7;
	}
	
	public Eraser(int w, int h) {
		if( w < 0 || h < 0 ) {
			System.out.println("Width or heigth must be greater than zero.");
			return;
		}
		this.width = w;
		this.height = h;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		if(w > 0) this.width = w;
	}
	
	public int getHeigth() {
		return height;
	}
	
	public void setHeight(int h) {
		if(h > 0) this.height = h;
	}
	@Override
	public String getType() {
		return "an " + type + " " + getWidth() + "x" +  getHeigth() ;
	}

}
