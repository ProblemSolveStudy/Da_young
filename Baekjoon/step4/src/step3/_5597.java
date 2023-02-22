package step3;
import java.util.Random;
import java.util.Scanner;


public class _5597 {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	boolean[]arr = new boolean[31];
		 
	
	for(int i=0; i<28; i++) {
		int num = scan.nextInt();
		arr[num] = true;
	}
	
	for(int i=1; i<=30; i++) {
		if(!arr[i])
			System.out.println(i);
	}
		
}}
