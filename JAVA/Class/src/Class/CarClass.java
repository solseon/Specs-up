package Class;

import Class.Car;

class Car {	// Car 클래스 생성
	int num;
	String color;
	
	void showInfo() {
		System.out.println(num + ", " + color);
	}
}

public class CarClass {
		public static void main(String[] args) {
			// 자동차 생성 
			Car c1 = new Car(); // 
			c1.num = 4;
			c1.color = "white";
			c1.showInfo();
					
			Car c2 = new Car();
			c2.num = 2;
			c2.color = "red";
			c2.showInfo();
					
	}
}
