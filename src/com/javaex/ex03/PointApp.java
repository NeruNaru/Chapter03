package com.javaex.ex03;

public class PointApp {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		int c = 6;
		System.out.println(a==b); //ture
		System.out.println(a==c); //false
		
		System.out.println("===============================");
		
		Point p01 = new Point(3, 6);
		Point p02 = new Point(3, 6);
		
		System.out.println(p01==p02); //false
		
		Point p03 = p01;
		
		System.out.println(p03 == p01);
		
		System.out.println(p01.equals(p02));
		
	}
}
