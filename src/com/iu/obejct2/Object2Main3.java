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
		m3.info2(member);
		System.out.println(member.age);
	}

}
