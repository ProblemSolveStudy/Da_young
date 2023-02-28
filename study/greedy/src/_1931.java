package study;

import java.util.Arrays;
import java.util.Scanner;

public class _1931 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][]time = new int[n][2]; // ȸ�ǽ��� ���� ���� ���۽ð��� ������ �ð�
		
		for(int i=0; i<n; i++){
			time[i][0] = in.nextInt(); 
			time[i][1] = in.nextInt(); 
		}
	
		Arrays.sort(time,(a, b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]); 
		// ������ �ð� �������� ���� ������ �ð��� ������ ���۽ð� �������� ����
		
		int endtime = 0; 
		int count = 0; // ȸ���� ��

		for(int i=0; i<n; i++){
			if (time[i][0] >= endtime) { // ȸ�� ���� �ð��� ���� ȸ���� ������ �ð� ���ĸ�
				endtime = time[i][1]; // ������ �ð� �ٲ��ְ� 
				count++; // ȸ�� �߰�
			}
		}
		System.out.print(count);
		
	}

}
