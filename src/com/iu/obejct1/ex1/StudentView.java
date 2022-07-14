package com.iu.obejct1.ex1;

public class StudentView {
	Student student = new Student();
	//viewMessage
	//문자열을 받아서 그 문자열을 출력 누군가 문자를 준다고요? 와낭 누가..?
	public void view(String message) {
		System.out.println(message);
	}
	
	//viewOne 메서드
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void view(Student student) {
		System.out.println("학생이름== "+student.getName());
		System.out.println("학생번호== "+student.getNum());
		System.out.println("국어== "+student.getKor());
		System.out.println("영어== "+student.getEng());
		System.out.println("수학== "+student.getMath());
		System.out.println("총점== "+student.getTotal());
		System.out.println("평균==  "+student.getAvg());
	}
	
	
	//viewAll 메서드
	//학생들의 정보를 받아서 모든 정보를 출력만 하면 됨
	public void view(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].getName());
			System.out.println(students[i].getNum());
			System.out.println(students[i].getKor());
			System.out.println(students[i].getEng());
			System.out.println(students[i].getMath());
			System.out.println(students[i].getTotal());
			System.out.println(students[i].getAvg());
		}//for문
	}//viewAll메서드
	

}
