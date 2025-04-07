package Class;

import Class.Card;

class Card {
	int number; // 카드의 숫자
	String shape; // 카드의 모양
	
	void showInfo() {
		System.out.println(number + ", " + shape);
	}
	
	void setShape(String str) {
		shape = str;
	}
	
	void setNumber(int num) {
		number = num;
	}
}

public class CardClass {
	public static void main(String[] args) {
		// 카드 생성
		Card s1 = new Card();
		s1.number = 11;
		s1.shape = "Heart";
		s1.showInfo();
					
		Card s2 = new Card();
		s2.number = 7;
		s2.shape = "Diamond";
					
	}
}
