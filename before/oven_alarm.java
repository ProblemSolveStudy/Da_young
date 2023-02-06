package smaple1;
import java.util.Scanner;

public class oven_alarm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // 시
		int b = scan.nextInt(); // 분
		int c = scan.nextInt(); // 분

		scan.close();
		
		
		int alr1 = a*60+b;
		int alr1= c+alr1;
		
		int hour = (alr1/60)%24;
		int min = alr1%60;
		
		System.out.println(hour+ " "+min);

		
		}	
	}

