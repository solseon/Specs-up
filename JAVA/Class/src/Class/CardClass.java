package Class;

class Card {
	int number; // 카드의 숫자
	String shape; // 카드의 모양
	
	Card() {
		this(1, "heart");
	}
	
	Card(int number, String shape) {
		this.number = number;
		this.shape = shape;
	}
	
	void printInfo() {
		System.out.println("모양:" + shape + ", 번호:" + number);
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
		c1.printInfo();
		
		Card c2 = new Card(7, "diamond");
		c2.printInfo();
					
	}
}
