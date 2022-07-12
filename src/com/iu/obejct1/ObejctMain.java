package com.iu.obejct1;

public class ObejctMain {

	public static void main(String[] args) {
		//메인은 누군가를 실행시켜주는 역할
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 참조변수명 =  new 클래스명(); // = new 생성자
		//class는 사용자가 만드는 또다른 data type이다 (reference type)
		//변수선언
		//데이터타입 변수명
		Monster monster = new Monster();	//주소가 담긴다 참초타입이기때문에 주소를 참조한다.
		System.out.println(monster); 
		//멤버변수 접근
		//참조변수명.멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name="오크";	//monster의 데이터 타입 Monster, monster.name의 데이터 타입은 String
		monster.hp=100;
		monster.level=5;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//---------------------------------------------------------------
		Monster monster2 = new Monster();
		monster2.name="오크";
		monster2.hp=100;
		monster2.level=5;
		
		System.out.println(monster2.name);
		System.out.println(monster2.level);
		System.out.println(monster2.hp);
		//System.out.println(monster==monster2);	//같냐? 아니다 다르다 같은기종의 핸드폰 두개가 같은것이냐?아닌것과 같다.
		//class역할 : 데이터를 담아 운반하는 역할
		
		Weapon sword = new Weapon();
		sword.name ="단검";
		sword.damage =10;
		sword.inchant = 1;
		
		monster.weapon = sword;// 주소값을 넣는것
		System.out.println(monster.weapon.name);	//단검  weapon : 레퍼런스 타입,
		
		System.out.println(monster2.weapon.name);	//null
		//멤버를 사용하려면 실제 보이는 객체 먼저 만들어야 한다.
		
		System.out.println("프로그램 종료");
	}

}
