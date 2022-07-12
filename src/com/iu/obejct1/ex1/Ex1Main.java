package com.iu.obejct1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		Student student = new Student();
//		student.name="바야바";
//		student.num=1;
//		student.kor=90;
//		student.eng=89;
//		student.math=70;
//		System.out.println(student.name);
//		System.out.println(student.num);
//		System.out.println(student.kor);
//		System.out.println(student.eng);
//		System.out.println(student.math);
//		
//		
//		Student student2 = new Student();	//객체 만들기
//		Student student3 = new Student();
		Student st =null;	//st의 데이터 타입은 Student
		Scanner scan = new Scanner(System.in);	
		Student[] students = new Student[3];
		for(int i=0; i<3; i++) {
			st = new Student();	
			System.out.println("이름입력");
			st.name = scan.next();
			students[i] = st;
//			System.out.println("학생번호 입력");
//			st.num = scan.nextInt();
//			System.out.println("국어성적을 입력");
//			st.kor =scan.nextInt();
		}
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
		
		//System.out.println(st.name); //이렇게 하면 마지막 한명만 나옴
		
		System.out.println("프로그램 종료");
	}

}
