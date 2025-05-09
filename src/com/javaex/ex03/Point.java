package com.javaex.ex03;

public class Point {
	//field
	private int x;
	private int y;
	//editor
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//method g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//method normal
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object obj) {
		boolean result;
		
		Point p = (Point)obj;
		
		if(this.x == p.x && this.y == p.y) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
}
