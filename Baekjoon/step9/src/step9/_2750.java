package step9;

import java.util.Arrays;
import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		// ���� �޼ҵ�
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
 
		}

	}


