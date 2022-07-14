package com.iu.obejct1.ex1;

import java.util.Scanner;

public class StudentController {
	
	Scanner scan ;
	StudentService ss ;
	StudentView sv ;
	Student[] students;
	//훙냔ㅇ냥 아 개졸령 ㅇㅅㅇ~
	
	public StudentController() {
		scan = new Scanner(System.in);
		sv = new StudentView();
		ss = new StudentService();
		//sc는 ss를 참조하겠다
		//sc는 sv를 참조하겠다.
		//sv객체를 sc에서 만들고 있음
		//ss객체를 sc에서 만들고 있음
	}
	
	public void start() {

		boolean check = true;
	
		Student student = null;
		while (check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				students = ss.makeStudents();
				System.out.println("1");
				break;
			case 2:
				//viewAll을 써서 출력
				sv.view(students);
				
				System.out.println("2");
				break;
			case 3:
				Student ff= ss.findStudent(students);
				
				if(ff == null) {
					sv.view("입력한 번호의 학생이 존재하지않습니다.");
				}else {
					sv.view(ff);
				}
				System.out.println("3");
				break;
			case 4:
				students = ss.removeStudent(students);
				System.out.println("4");
				break;
			case 5:
				//학생추가
				students = ss.addStudent(students);
				System.out.println("5");
				break;
			default:
				System.out.println("종료중");
				check =!check;
			}
			
		}
	}

}
