package com.iu.obejct2;

import java.util.Scanner;

public class Method2 {

	//intfo 메서드 선언
	public void  info() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("이름을 입력");
		String name = scan.next();
		System.out.println(name);

		
		
		Method1 mt = new Method1();
		mt.test();
		
		System.out.println(name);
	}
	
}
