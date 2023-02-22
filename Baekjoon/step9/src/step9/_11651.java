package step9;

import java.util.Arrays;
import java.util.Scanner;

public class _11651 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int arr[][]  = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		Arrays.sort(arr,(a,b)->{
			if(a[1] == b[1]) {
				return a[0] - b[0];
			}else {
				return a[1] - b[1];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
