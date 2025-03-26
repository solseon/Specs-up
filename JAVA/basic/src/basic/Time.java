package basic;

import java.util.Scanner;

public class Time {
	Scanner scan = new Scanner(System.in);
	int time = scan.nextInt();
	
	int hour = time/3600;
	
	int min = (time%3600) / 60;
					
	int sec = (time%3600) % 60;
	
	
	// 또 다른 방법
	/*
	 int sec = time%60;
	 
	 int temp = time/60;
	 
	 int min = temp%60;
	 
	 int hour = temp/60;
	 */
}
