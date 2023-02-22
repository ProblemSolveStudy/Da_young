package smaple1;
import java.util.Scanner;

public class baekjoon_10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n]; // 배열 함수 선언하기
		int cnt = 0; // count 함수
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			int v = scan.nextInt();
			if(v == arr[i])
				cnt++;	
		}
		System.out.println(cnt);

		}	
	
	}

