package com.iu.obejct1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//StudentController의 start메서드 호출
		Scanner scan = new Scanner(System.in);
		StudentController sc = new StudentController();	//new뒤에 적힌 StudentController() 는 메서드인가 클래스인가? 메서드다 
			sc.start();
		
		}
			
		
		
		

}
