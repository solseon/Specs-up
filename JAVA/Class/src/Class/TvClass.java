package Class;


class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	
	void setChannel(int num) {
		channel = num;
	}
	
	int getChannel() {
		return channel;
	}
}


public class TvClass {
	public static void main(String[] args) {
		Tv c5 = new Tv();
		Tv c11 = new Tv();
		
		c5.setChannel(5);
		c11.setChannel(11);
		
		System.out.println("첫번째 채널: " + c5.getChannel() + 
							" ,두번째 채널: " + c11.getChannel());
		
	}
}
