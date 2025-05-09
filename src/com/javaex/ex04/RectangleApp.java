package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {

		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
		
		System.out.println(a);	//toString()
		System.out.println(b);	//toString()
		System.out.println(c);	//toString()
		
		System.out.println(a.equals(b)); //true가 나와야함
		System.out.println(a.equals(c)); //false가 나와야함
	}

}
