package step9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _25305 {
public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		int n = in.nextInt(); // 응시자 수
		int k = in.nextInt(); // 상 받은 사람 수 
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}

		// 방법 1:내림차순 정렬 -->  [100, 98, 93, 85, 76] 
		Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.println(arr[k-1]);		
		
        // 방법 2	: 오름차순 정렬 --> [76, 85, 93, 98, 100]	
        //		System.out.println(arr[n-k]);
	}

}
