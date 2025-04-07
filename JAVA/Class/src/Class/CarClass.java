package Class;

import Class.Car;

class Car {	// Car 클래스 생성
	int num;
	String color;
	
	void showInfo() {
		System.out.println("문 개수:" + num + ", 자동차 색깔:" + color);
	}
}

public class CarClass {
		public static void main(String[] args) {
			 
			Car c1 = new Car();
			c1.num = 4;
			c1.color = "white";
			
			Car c2 = new Car();
			c2.num = 3;
			c2.color = "red";
			
			c1.showInfo();
			c2.showInfo();
					
	}
}
