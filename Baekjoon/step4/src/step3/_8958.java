package step3;

import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String arr[] = new String[in.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();	
			}
		
		in.close();
		
		for(int i=0; i<arr.length; i++) {
			int sum=0; // 누적 합산
			int cnt=0; // 연속 횟수 
			
			for(int j=0; j< arr[i].length() ; j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;}
				else {
					cnt = 0;}
				sum += cnt;
				
				}
				System.out.println(sum);	
			}
		}
		
		
	}





