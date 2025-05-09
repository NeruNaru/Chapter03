package com.javaex.ex02;

public class Point {

	//field
	private int x;
	private int y;
	//editor
	public Point(int x, int y) {
		super(); //Object클래스의 기본생성자, 생략 가능
		this.x = x;
		this.y = y;
	}

	public Point() {
	} //Object클래스의 기본 생성자 호출
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
	
}
