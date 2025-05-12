package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));			//a문자열에 b문자열을 더하기
		
		System.out.println(b+a);
		System.out.println(b.concat(a));			//b문자열에 a문자열을 더하기
		
		System.out.println("\n========================\n");
		
		//실험을 위하여 a값을 바꾸기
		a= a.concat(b);								//문자열을 합친다.
		System.out.println(a);
		
		a = a.trim();								//a문자열 양 끝에 공백을 제거한다
		System.out.println(a);
		
		a = a.replace("ab", "12");					//a문자열에서 ab를 12로 바꾼다
		System.out.println(a);
		
		System.out.println("\n=======================\n");
		
		String[] sArray = a.split(" , ");			//a문자열을 ","기준으로 나누어서 배열에 담는다
		for(int i = 0 ; i<sArray.length ; i++) {	//그리고 배열의 주소를 리턴한다
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		System.out.println("\n=======================\n");
		
		String str = "Hello Java";
		String result01 = str.substring(3);			//str문자열의 앞3글자를 제외하고 출력
		System.out.println(result01);
		
		String result02 = str.substring(1, 7);		//str문자열을 1번째 7번째 사이의 글자만 출력
		System.out.println(result02);
		
		char c = str.charAt(0);						//str문자열의 1번째(cahr의 시작은 0부터) 글자만 출력
		System.out.println(c);
	}

}
