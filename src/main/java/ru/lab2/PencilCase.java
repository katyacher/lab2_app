package ru.lab2;

public class PencilCase {
	private Item item;
	
	public PencilCase( Item item) {
		this.item = item;
	}
	
	public void take_an_item() {
		System.out.println("Take from pencil case " + item.getType());
	}
}	

