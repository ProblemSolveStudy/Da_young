package smaple1;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int tot = 0;

		for(int i=0; i<=x; i++){
			tot += i;
		}
		System.out.println(tot);

		}	
	}

