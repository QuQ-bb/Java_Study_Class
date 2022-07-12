package com.iu.obejct1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		Student [] students = new Student[3];
		Student st = new Student();
		for(int i=0; i<students.length; i++) {
			System.out.println("이름을 입력해주세요.");
			st.name = scan.next();
			students[i] =st;
		}
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
		
		
		System.out.println("프로그램 종료");
	}

}
