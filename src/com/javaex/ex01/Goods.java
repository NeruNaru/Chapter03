package com.javaex.ex01;

public class Goods {
	
	//field
	private String name;
	private int price;
	
	//editor
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//method g/s
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	//method normal

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
}
