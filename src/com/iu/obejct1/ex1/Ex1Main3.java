package com.iu.obejct1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student [] students= new Student[3];
		Student st= null;
		for(int i= 0; i<students.length; i++) {
			st = new Student();
			students[i]=st;	//어차피 주소를 공유하는것이기 때문에 먼저 대입해서 넣어도  주소가 이미 들어갔기때문에  정상적인 결과가 출력된다.
			System.out.println("이름 입력");
			students[i].name = scan.next();
			//st.name =scan.next();
			
			//데이터를 다 입력 받은 후 대입해도 되고 주소를 먼저 대입후 데이터를 입력받아도된다.
		}
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
		}
	}

}
