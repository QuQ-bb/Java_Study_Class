package com.iu.object3;

import java.util.Random;

public class ReturnTest {
	
	public int makeRandom() {
			Random random = new Random();
			int num = random.nextInt(50);
			
			
			//return 리턴하려는Data
			return num;
			
	}
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	//1.입력받은 만큼의 숫자를 출력 
	//2.한번에 담아서 출력
	//3.
	public int[] makeRandom2(int count) {
		Random random  = new Random();
		int[] nums = new int[count];
		
		for(int i=0; i<count; i++) {
//			int num =random.nextInt(50);
//			nums[i] = num;
			nums[i] =random.nextInt(50);
		}
		
		return nums;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}

}
