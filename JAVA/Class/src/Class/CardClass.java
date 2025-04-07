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
		Card c1 = new Card();
		c1.setNumber(11);
		c1.shape = "Heart";
		c1.showInfo();
					
		Card c2 = new Card();
		c2.number = 7;
		c2.setShape("Diamond");
		c2.showInfo();
					
	}
}
