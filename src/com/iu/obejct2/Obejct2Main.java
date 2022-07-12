package com.iu.obejct2;

public class Obejct2Main {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		Method1 mt1 = new Method1();
		//mt1 : 참조변수
		
		//멤버변수 사용
		//참조변수명.변수명
		
		//멤버메서드 사용(메서드를 호출)
		//참조변수명.메서드명()
		mt1.test();	//Test Method실행 출력됨
		
		//System.out.println(num); //오류남 why? 메서드 안에 선언된 변수는 지역변수 num : 지역변수
		//메서드 내에 선언된 변수들이 저장되는 공간 : stack 맨 처음 저장되는 것은 main메서드
		
		System.out.println("프로그램 종료");
	}

}
