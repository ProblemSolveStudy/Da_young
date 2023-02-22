package smaple1;
import java.util.Scanner;

public class alarm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt(); // 시
		int m = scan.nextInt(); // 분
		scan.close();
		
		if(m<45) {
			h--;
			m = 60 - (45 - m);
			if(h<0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		else {
			System.out.println(h + " " + (m-45));
		}
		
		}	
	}

