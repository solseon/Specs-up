
public class CardTest {
	public static void main(String[] args) {
		
		Card.width = 100;
		Card.height = 200;
		
		Card c1 = new Card(1, "heart");
		Card c2 = new Card(2, "diamond");
		Card c3 = new Card(3, "diamond");
	}
}

class Card{
	int num;
	String shape;
	
	static int width;
	static int height;
	
	Card(int num, String shape) {
		this.num = num;
		this.shape = shape;
	}
}
