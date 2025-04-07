package Class;

class MyTv {
	int Channel;
	String color;
	Boolean power = false;
	
	void powerOnOff() {
		power = !power;
	}
	void channerUp() {
		Channel += 1;
	}
	void channerDown() {
		Channel -= 1;
	}
	
	void print() {
		
		System.out.println( power );
	}
}

public class MytvClass {
	public static void main(String[] args) {
		MyTv c = new MyTv();
		c.print();
		c.powerOnOff();
		c.print();
	}
}
