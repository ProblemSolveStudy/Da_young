package step8;

import java.util.Scanner;

public class _2563 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // ������ ����
		int total = 0; 
		int [][] arr = new int[100][100];
		
		for(int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int j=x; j<x+10; j++)
				for(int k=y; k<y+10; k++) {
					if(arr[j][k] ==1) // ������ ���� �̹� ĥ�� ��� ==> �ߺ�
						continue;
					arr[j][k] =1;
					++total; // ������ ������ ��ĥ�ϱ�
				}
			
		}
	System.out.println(total);
	}
			
		
		
	}

