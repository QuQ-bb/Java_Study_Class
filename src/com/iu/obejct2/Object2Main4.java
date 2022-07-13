package com.iu.obejct2;

public class Object2Main4 {

	public static void main(String[] args) {

		
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email ="iu@gmail.com";
		
		Member member2 = new Member();
		member2.name = "jayp";
		member2.age = 32;
		member2.email ="jayp@naver.com";
		
		Member member3 = new Member();
		member3.name = "suji";
		member3.age = 29;
		member3.email ="suji@gmail.com";

		Member[] members = new Member[3];
		members[0] =member;
		members[1] = member2;
		members[2] = member3;
	
		
		Method4 m4 = new Method4();
		m4.info(members);
		System.out.println(members.length);	//3
		
		
	
	
	}

}
