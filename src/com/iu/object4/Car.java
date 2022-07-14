package com.iu.object4;

public class Car {

	String madeCompony="쌍용";	//변수 선언과 동시에 초기화 하는것
	String brand;
	String color;
	boolean gear;	//true면 오토, false 수동
	
	//String gear;
	
	//instance block 초기화 블럭{}
	{
//		this.madeCompony = "기아";
//		this.brand = "k5";
//		this.color = "black";
//		this.gear = false;
	}
	
	public Car(String color, String brand) {
		this.madeCompony = "현대";
		this.brand = brand;
		this.color = color;
		this.gear = true;
	}
	public Car() {
		
		//자기자기신의 또다른 생성자를 호출할때
		//생성자 내에서 또 다른 생성자를 호출할 때
		//생성자 영역내에서 첫줄에 위치해야 됨
		//this() 위에 코드를 작성하면 오류발생
		
		this("White");
//		this.madeCompony = "현대";
//		this.brand = "아반떼";
//		this.color = "White";
//		this.gear = true;
	}
	
	public Car(String color) {		//생성자도 메서드기 때문에 overLoading 가능함
//		this.madeCompony = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = true;
		this("아반떼",color);
	}
	
	
	
	public void info() {
		System.out.println("Compony: "+ this.madeCompony);
		System.out.println("Brand: "+ this.brand);
		System.out.println("Color: "+ this.color);
		System.out.println("Gear: "+ this.gear);
	}
	
	
}
