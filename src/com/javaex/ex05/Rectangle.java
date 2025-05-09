package com.javaex.ex05;

public class Rectangle {
	//field
	private int width;
	private int height;
	//editor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
	}
	//method g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//method normal
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public boolean equals(Rectangle obj) {
		boolean result;
		
		Rectangle r = (Rectangle)obj;
		if((this.width)*(this.height) == (r.width)*(r.height)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
