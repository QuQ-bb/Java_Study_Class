package com.iu.obejct2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		AnimalSound as = new AnimalSound();
		System.out.println("1. Dog 2.Cat 3.Tiger");
		int select = scan.nextInt();
		System.out.println("횟수를 입력");
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			if(select ==1) {
				as.dogSound();
			}else if(select ==2) {
				as.catSound();
			}else {
				as.tigerSound();
			}
			
		}

	}

}
