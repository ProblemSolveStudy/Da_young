package study;

import java.util.Arrays;
import java.util.Scanner;

public class _11399 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0; // �� ��
		int wait = 0; // ���� ��
		
		for(int i=0; i<n; i++) {
			wait += arr[i];
			sum += wait;
		}
		System.out.println(sum);
		
	}

}
