package study;

import java.util.Arrays;
import java.util.Scanner;

public class _1931 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][]time = new int[n][2]; // 회의실의 수에 대한 시작시간과 끝나는 시간
		
		for(int i=0; i<n; i++){
			time[i][0] = in.nextInt(); 
			time[i][1] = in.nextInt(); 
		}
	
		Arrays.sort(time,(a, b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]); 
		// 끝나는 시간 기준으로 정렬 끝나는 시간이 같으면 시작시간 기준으로 정렬
		
		int endtime = 0; 
		int count = 0; // 회의의 수

		for(int i=0; i<n; i++){
			if (time[i][0] >= endtime) { // 회의 시작 시간이 이전 회의의 끝나는 시간 이후면
				endtime = time[i][1]; // 끝나는 시간 바꿔주고 
				count++; // 회의 추가
			}
		}
		System.out.print(count);
		
	}

}
