package smaple1;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();

		if(x>0) 
			if(y>0)
				System.out.println("1");
			else 
				System.out.println("4");
		else
			if(y>0)
				System.out.println("2");
			else 
				System.out.println("3");
						
	
		}	
	}

