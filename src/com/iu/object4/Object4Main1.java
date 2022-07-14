package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		
		//객체생성
		Resume re = new Resume();	//객체 생성할 때 생성자 호출  딱1번 사용 그후 사용불가
		
		//생성자도 메서드인데 re.Resume()으로 사용할수 있는가? 사용할수 없다.
		//모든 클래스엔 1개이상의 생성자가 있어야하는데 여지껏 없이 사용했는데 어떻게 한것인가? 
		//클래스 내에 생성자가 없으면 컴파일러가 기본생성자를 만들어줌
		//기본생성자 : 매개변수가 없는 생성자 default Constructor, 빈 생성자 라고도 불림
		
		//객체생성
		Car car1 = new Car();	//생성자가 하는일 멤버변수 초기화,객체가 만들어질때 뭔가 일을 하고싶을때 생성자 생성함
		//컴파일러가 기본생성자를 하나 만들어준다 했잖아요 기본생상자가 어떤거라고? 매개변수가 없는 생성자
		//기본생성자를 컴파일러가 만들어줄때는 ..못들었다..
		//null도 데이터다 

		//car1.brand = "토레스";
		car1.color="black";
		car1.info();
		
		Car car2 = new Car("black");
		car2.info();
		
		
		Car car3 = new Car("Blue", "티볼리");
		car3.info();
		// ##### 멤버변수 초기화 하는 방법
		// 1. 멤버변수 선언과 동시에 초기화 		: 활용도 하
		// 2. 객체 생성 후 멤버변수에 값을 대입	: 활용도 하
		// 3. 생성자에서 초기화 				: 활용도 중
		// 4. instance block			: 활용도 하
		// 5. Getter / Setter 메서드 		: 활용도 상
		
		//실행 순서
		//1 -> 4 -> 3 -> 2,5
	}

}
