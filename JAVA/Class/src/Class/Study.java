package Class;

import java.util.Scanner;

// Tv클래스
class Tvtest {
	
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelIp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	// 채널 설정
	void setChannel(int num) {
		channel = num;
	}
	// channel 반환
	int getChannel() {
		return channel;
	}
}
// 자동차 클래스
class Cartest {
	
	String color;
	int door;
	
	void printInfo() {
		System.out.println(color + " " + door + "도어");
	}
	// color값을 반환
	String getColor() {
		return color;
	}
	// color값을 저장
	void setColor(String str) {
		System.out.println("칼라값 변경 " + str);
		color = str;
	}
	// Door값을 반환
	int getDoor() {
		return door;
	}
	// Door값을 저장
	void setDoor(int num) {
		door = num;
	}
}
// Card 클래스
class Cardtest {
	
	String shape;
	int num;
	
	void printInfo() {
		System.out.println("모양:" + shape + ", 번호:" + num);
	}
	// 모양값 반환
	String getShape() {
		return shape;
	}
	// 번호값 반환
	int getNum() {
		return num;
	}
	// 모양값 저장
	void setShape(String str) {
		shape = str;
	}
	// 번호값 저장
	void setNum(int n) {
		num = n;
	}
}

public class Study {
	public static void main(String[] args) {
//		func1();
//		func2();
	}
	// 문제 2
	static void func1() {
		
		Tvtest t1 = new Tvtest();
		Tvtest t2 = new Tvtest();
		
		t1.setChannel(5);
		t2.setChannel(11);
		
		System.out.println("t1의 채널: " + t1.getChannel() + ", t2의 채널: " + t2.getChannel());
	}
	// 문제 3
	static void func2() {
		
		Scanner sc = new Scanner(System.in);
		
		Cartest[] car = new Cartest[5];
		System.out.println("자동차 색과 문의 개수를 5개 입력해주세요: ");
		
		for(int i = 0; i < car.length; i ++) {
			String color = sc.next();
			int door = sc.nextInt();
			
			car[i] = new Cartest();
			car[i].setColor(color);
			car[i].setDoor(door);
		}
		
		for(int i=0; i < car.length; i++) {
			car[i].printInfo();
		}
	}
	// 문제 4
	static void func3() {
		
		Cardtest[] card = new Cardtest[13]; 
		
		// 배열 shape 속에 모양 저장
		String[] shape = {"diamond", "club", "heart", "spade"};
		
	}
}


