package Class;

import Class.Car;

class Car {	// Car 클래스 생성
	int door;
	String color;
	//생성자
	//this.매개변수는 필드네임이랑 매개변수 이름이 같을때 구분을 위해 쓴다 door = door; (x)
	Car() {
		this(4, "white");
	}
	//매개변수가 2개인 생성자
	Car(int door, String color) {
		this.door = door; 	
		this.color = color;
	}
	
	
	void printInfo() {
		System.out.println("문 개수:" + door + ", 자동차 색깔:" + color);
	}
}

public class CarClass {
		public static void main(String[] args) {
			 
			Car c1 = new Car();
			c1.printInfo();
			
			Car c2 = new Car(3, "red");
			c2.printInfo();
					
	}
}
