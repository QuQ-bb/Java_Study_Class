package com.iu.obejct2;

public class Object2Main3 {

	public static void main(String[] args) {
		
		Method3 m3= new Method3();
		//월급 입력
		int salary = 5000000;
		
		m3.sal(salary);
		System.out.println(salary);
		
		m3.hap(salary, salary);
		
		m3.info("iu", 30, "iu@gmail.com");
		
		Member member = new Member();
		member.name = "suji";
		member.age = 30;
		member.email= "suji@gmail.com";
		System.out.println("웅냥냥"+member.age);
		m3.info2(member);	//member에 있는 값을보내는것
		System.out.println(member.age);
		//왜 100이 나올까? 
	}

}

//메서드 중간 {} 안에 있는 변수들은 다 stack에 쌓인다
//멤버 선언 -내가담을 데이터만큼 메모리를 확보 하는것
