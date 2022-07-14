package com.iu.obejct1.ex1;

public class Student {

	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {	//setTotal은 객체를 만들어야 사용할 수 있고 객체를 생성시 this가 같이 생성됨
		this.total = this.kor + this.eng + this.math;
	}	
	
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = this.total/3.0;
	}
	
	private int checkPoint(int point) {
		if(point < 0 || point >100) {
			return 0;
		}else {
			return point;
		}
		
	}
	
	
	
	
		//this 생략가능, 객체마다 this가 생기고 각자의 자기 자신의 주소를 담고있다
		
		//객체 생성시 this는 heap영역에 같이 만들어진다 가정하고 만들어진 객체의 주소가 같이 담긴다고 생각하자
		//()가 있으면 메서드 ,없으면 변수
	
		//this.setAvg();	//메서드 내에서 다른 메서드 호출이 가능한가? 원리상 가능하다 
		
		//멤버변수에 total을 사용하고 매개변수의 total을 사용하면 중복인가?
		//ㄴㄴ 메모리 영역이 다르기때문에 이름이 같더라도 다른것으로 구분된다
		//멤버변수와 매개변수의 변수명을 같게 쓰는경우도 많다 
		//지역변수와 멤버변수를 구분할때 this를 사용해준다
		
	

	

	
	
	
}
