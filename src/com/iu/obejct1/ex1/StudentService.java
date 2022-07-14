package com.iu.obejct1.ex1;

import java.util.Scanner;

import javax.xml.stream.events.Namespace;

public class StudentService {
	Scanner scan;
	//생성자 생성
	public StudentService() {
		scan = new Scanner(System.in);
	}
	
	//removeStudent메서드
	//학생들의 정보를 받아서 
	//삭제하려는 학생의 번호를 입력받기
	//학생의 번호와 일치하는 학생을 삭제
	//남은 학생정보들을 리턴
	public Student[] removeStudent(Student[] students) {
		//학생을 삭제하기위해 새로운 배열을 생성해준다
		System.out.println("정보를 삭제할 학생의 번호를 입력해주세요.");
		int num =scan.nextInt();
		
		boolean check = false;
		//일단 삭제할 번호와 일치하는 번호가 있는지 확인해준다
		int i=0;
		for(i=0; i<students.length; i++) {
			if(num == students[i].getNum()) {
				break;
			}else {
				System.out.println("입력하신 번호와 일치하는 학생의 정보가 존재하지않습니다.");
			}
		}//for문
		Student[] students3 = new Student[students.length-1];
		for(int j=0; j<students.length; j++) {
			if(i==j) {
				continue;
			}//if문
			students3[j] =students[j];
		}//for문
		
		  students=students3;
		
		  return students;
	}//removeStudent
	
	
	
	
	//addStudent메서드
	//학생들의 정보를 받아서
	//학생한명을 추가해주는것
	//학생정보들을 리턴
	public Student[] addStudent(Student[] students) {
		 
		//추가할 학생이 들어갈 배열을 선언해준다.
		Student[] students2 = new Student[students.length+1];
		
		for (int i= 0; i<students.length; i++) {
			students2[i] = students[i];
		}
		
		students2[students.length] = new Student(); 
		//students2[인덱스번호] = new Student();
		
		
		System.out.println("추가할 학생의 이름을 입력해주세요.");
		students2[students.length].setName(scan.next());
		System.out.println("추가할 학생의 번호를 입력해주세요.");
		students2[students.length].setNum(scan.nextInt()); 
		System.out.println("추가할 학생의 국어성적을 입력해주세요.");
		students2[students.length].setKor(scan.nextInt());
		System.out.println("추가할 학생의 영어성적을 입력해주세요.");
		students2[students.length].setEng(scan.nextInt());
		System.out.println("추가할 학생의 수학성적을 입력해주세요.");
		students2[students.length].setMath(scan.nextInt());
		
		
		//int total =scan.nextInt();
		//int avg = scan.nextInt();
		students2[students.length].setTotal();// = students2[students.length].kor + students2[students.length].eng + students2[students.length].math;
		students2[students.length].setAvg(); // = students2[students.length].total/3.0;
		
		students =students2;
		
		return students;
	}
	
	
	
	
	
	//findStudent 메서드
	//검색하고 싶은 학생의 번호를 입력받습니다.
	//같은 번호의 학생을 찾아서 그 학생을 리턴
	//없으면 null을 리턴하세요.
	//학생의 정보를 어디서 찾아오는가?
	
	public Student findStudent(Student[] students) {
		System.out.println("검색하고 싶은 학생의 번호을 입력해주세요.");
		int search = scan.nextInt();
		
		//Student student = null;
		
		for(int i=0; i<students.length; i++) {
			if(search == students[i].getNum()) {
				return students[i];
				//student = student[i];
				//break;
			}
		}
			return null;
			//return student;
	}
	
	
	
	

	//makeStudents
	//학생수를 입력받고,
	//학생수만큼 정보를 입력받고, 총점,평균은 자동계산
	//학생들을 리턴
	public Student[] makeStudents() {
		System.out.println("학생의 수를 입력주세요.");
		int num= scan.nextInt();
		Student[] students = new Student[num];
		
		for(int i=0; i<students.length; i++) {
			
			Student student = new Student();
			
			System.out.println("학생의 이름을 입력해주세요.");
			student.setName(scan.next()); 
			System.out.println("학생의 번호를 입력해주세요.");
			student.setNum(scan.nextInt());
			System.out.println("학생의 국어성적을 입력해주세요.");
			student.setKor(scan.nextInt());
			System.out.println("학생의 영어성적을 입력해주세요.");
			student.setEng(scan.nextInt());
			System.out.println("학생의 수학성적을 입력해주세요.");
			student.setMath(scan.nextInt());
			
			student.setTotal();
			
			//student.total = student.kor+student.eng+student.math;
			//student.avg = student.total/3.0;
			
			students[i] = student;
		}//for
		return students;
	}//makeStudents
	
}
