package com.javaex.ex06;

public class Ex01 {
	//field
	
	//editor
	
	//method g/s
	
	//method normal
	public static void main(String[] args) {
		
		//우리가 알고 있는 일반적인 규칙
		String s00 = new String("안녕하세요");
		String s01 = new String("안녕하세요");
		
		System.out.println(s00.toString());
		System.out.println(s01.toString());
		
		System.out.println(s00 == s01); //s00와 s01의 주소가 같은지 확인
		System.out.println(s00.equals(s01)); //s00와 s01의 내용물(글자)가 같은지 확인
		System.out.println("=============================");
		
		//String 약식으로 사용할 때
		//같은 문자열이 있는지 체크한다
		//있다면 새로 만들지 않고 같은 곳을 가리킨다
		//-->문자열을 변경하면 같이 변경되어야 한다 --> 이렇게 하면 안된다
		
		String str00 = "hi";
		String str01 = "굿모닝";
		String str02 = "굿모닝"; //str01과 같은 주소
		
		System.out.println(str00.toString());
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		System.out.println(str01 == str02);
		System.out.println(str01.equals(str02));
		
		//*********문자열을 변경하면 메모리에서는 같이 변경되어야 하나
		//실제로는 따로따로 변경되어야 한다.
		str01 = "굿이브닝";
		System.out.println(str01 == str02); // 주소가 바뀐다 => 새로 만들었다
		
		System.out.println(str01.toString());
		System.out.println(str02.toString());
	}
}
