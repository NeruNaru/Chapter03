package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 Object클래스이다
		Goods camera = new Goods();
		camera.hashCode();	//내가 만든 메소드가 아님
							//부모 Object클래스의 메소드
		
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
	}

}
