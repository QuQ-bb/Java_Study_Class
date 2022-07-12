package com.iu.obejct2;

public class Method1 {

	//멤버변수 선언
	//외향적인것을 설명하는것  : 멤버변수
	//메소드로 
	//class는 변수랑 메소드를 선언할 수 있음 
	//반대로 메소드만 선언하는 class도 있음
	
	
	//멤버 변수 선언 공식
	//접근 지정자 [그외지정자] 데이터 타입 변수명; 				//[ ] : 쓸수도 있고 안쓸수도있음 
	//멤버 메소드 선언공식
	//접근지정자 [그외지정자] 리턴타입 메소드명([매개변수들 선언]){ //[ ] : 쓸수도 있고 안쓸수도있음 
	//		실행할 코드 작성
	//}			
	
	//접근 지정자 : public
	//그외 지정자 : 생략
	//리턴타입   : void
	//메서드명   : 각자 생성(첫글자는 소문자로 시작)
	//매개변수   : 생략
	public void test() {
		System.out.println("Test Method 실행");
		int num = 10;
		System.out.println(num);
	}
	
}
