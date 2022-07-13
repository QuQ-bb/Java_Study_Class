package com.iu.obejct2;

public class Method4 {
	

	//info
	//멤버들의 정보를 출력하는 메서드
	public void info(Member[] members) {
		for(int i=0; i<members.length; i++) {
			System.out.println(i+1+"번째 멤버 이름= "+members[i].name);
			//mebers[i]의 타입은 Member []
			System.out.println(i+1+"번째 멤버 나이= "+members[i].age);
			System.out.println(i+1+"번째 멤버 이메일= "+members[i].email);
			System.out.println();
		}
		
		members = new Member[2];
	}
	
	
}
