package smaple1;
import java.util.Random;
import java.util.Scanner;

public class _999 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        Random random = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)
        random.setSeed(System.currentTimeMillis()); //시드값 설정을 따로 할수도 있음

		for(int i=0; i<num; i++) {
	        int a= random.nextInt(10); 		
	        int b= random.nextInt(10); 	
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
		}
		}
	}

