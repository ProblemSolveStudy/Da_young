package step9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _25305 {
public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		int n = in.nextInt(); // ������ ��
		int k = in.nextInt(); // �� ���� ��� �� 
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}

		// ��� 1:�������� ���� -->  [100, 98, 93, 85, 76] 
		Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.println(arr[k-1]);		
		
        // ��� 2	: �������� ���� --> [76, 85, 93, 98, 100]	
        //		System.out.println(arr[n-k]);
	}

}
