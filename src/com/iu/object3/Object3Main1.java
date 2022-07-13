package com.iu.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		//멤버메서드를 호출하려면 객체부터 생성해야한다
		ReturnTest rt = new ReturnTest();
		int num=0;
		rt.info();      
		num =rt.makeRandom();	//2
		System.out.println(num);
		

		System.out.println("===========================================");
		int[] nums= rt.makeRandom2(7);
		//makeRandom2에 있는 nums랑 다른 nums임
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
			
			
			Account ac= rt.makeAccount();
			System.out.println(ac.title);
			System.out.println(ac.host);
			System.out.println(ac.nums);
			System.out.println(ac.balance);

	}

}
