package Class;

import Class.Card;

class Card {
	int number; // 카드의 숫자
	String shape; // 카드의 모양
	
	void showInfo() {
		System.out.println(shape + ", " + number);
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
		c1.setNumber(7);
		c1.shape = "Diamond";
		c1.showInfo();
					
		Card c2 = new Card();
		c2.number = 3;
		c2.setShape("Heart");
		c2.showInfo();
		
		Card c3 = new Card();
		c3.setNumber(11);
		c3.setShape("Clover");
		c3.showInfo();
					
	}
}
