package Main;

public class thisAbout {
	private String color;
	private int door;
	
	Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	Car(){
		this("White", 4);
	}
	void showInfo() {
		System.out.println(color + ", " + door);
	}
	void setColor(String color) {
		this.color = color;
	}
	void setDoor(int door) {
		this.door = door;
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setColor("Blue");
		c1.showInfo();
		
		Car c2 = new Car("red" , 3);
		c2.showInfo();
	}
}
