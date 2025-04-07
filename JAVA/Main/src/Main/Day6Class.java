package Main;

class Car {	// Car 클래스 생성
	int num;
	String color;
	
	void showInfo() {
		System.out.println(num + ", " + color);
	}
}

class Card {
	int number; // 카드의 숫자
	String shape; // 카드의 모양
	
	void showInfo() {
		System.out.println(number + ", " + shape);
	}
	
}
public class Day6Class {
	
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
			
			// 카드 생성
			Card s1 = new Card();
			s1.number = 11;
			s1.shape = "Heart";
			s1.showInfo();
			
			Card s2 = new Card();
			s2.number = 7;
			s2.shape = "Diamond";
			s2.showInfo();
		}
		
}
