package smaple1;
import java.util.Scanner;

public class receipt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt(); // 총 합계
		int N = scan.nextInt(); // 종류 수
		
		int total=0;
		
		for(int i=0; i<=N; i++){
			int a = scan.nextInt(); 
			int b = scan.nextInt(); 
			
			total = total -( a * b);

		}
		if(total == X)
			System.out.println("Yes");
		else
			System.out.println("No");
		}	
	}

