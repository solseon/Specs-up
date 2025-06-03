package bbb.bbb;

public class CardTest {
	
	public static void main(String[] args) {
		
		Card c1 = new Card(1, "heart");
		c1.setNum(3);
		c1.setShape("diamond");
		
	}
}

class Card{
	private int num;
	private String shape;
	
	Card(int num, String shape) {
		this.num = num;
		this.shape = shape;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	void setShape(String shape) {
		this.shape = shape;
	}
	
	int getNum() {
		return num;
	}
	
	String getShape() {
		return shape;
	}
}