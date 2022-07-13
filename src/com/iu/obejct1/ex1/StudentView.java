package com.iu.obejct1.ex1;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력 누군가 문자를 준다고요? 와낭 누가..?
	public void viewMessage(String message) {
		System.out.println(message);
	}
	
	//viewOne 메서드
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void viewOne(Student student) {
		System.out.println("학생이름== "+student.name);
		System.out.println("학생번호== "+student.num);
		System.out.println("국어== "+student.kor);
		System.out.println("영어== "+student.eng);
		System.out.println("수학== "+student.math);
		System.out.println("총점== "+student.total);
		System.out.println("평균==  "+student.avg);
	}
	
	
	//viewAll 메서드
	//학생들의 정보를 받아서 모든 정보를 출력만 하면 됨
	public void viewAll(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].kor);
			System.out.println(students[i].eng);
			System.out.println(students[i].math);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
		}//for문
	}//viewAll메서드
	

}
