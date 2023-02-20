package step8;

import java.util.Scanner;

public class _2563 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // 색종이 개수
		int total = 0; 
		int [][] arr = new int[100][100];
		
		for(int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int j=x; j<x+10; j++)
				for(int k=y; k<y+10; k++) {
					if(arr[j][k] ==1) // 이전에 의해 이미 칠한 경우 ==> 중복
						continue;
					arr[j][k] =1;
					++total; // 검은색 색종이 색칠하기
				}
			
		}
	System.out.println(total);
	}
			
		
		
	}


