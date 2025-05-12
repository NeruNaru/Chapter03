package com.javaex.ex06;

public class Ex03 {
	public static void main(String[] args) {
		String s01 = new String("Hello");
		String s02 = new String("Hello");
		
		System.out.println(s01 == s02);
		System.out.println(s01.equals(s02));
		
		System.out.println("\n=======================\n");
		
		String s03 = "GoodMorning";
		String s04 = "GoodMorning";
		
		System.out.println(s03 == s04);
		System.out.println(s03.equals(s04));
		
		s03 = "GoodEvening";
		System.out.println(s03 == s04);
		
		System.out.println(s03.equals(s04));
		
		System.out.println("\n====================\n");
		
		if(s03.equals("GoodMorning")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		String s05 = "hello";
		
		if(s05.equals("hello")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println("\n====================\n");
		
		s05 = null;
		if("hello".equals(s05)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}
