package step8;

import java.util.Scanner;


public class _1978 {
public static void main(String[] args) {
	

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			
			// �Ҽ��ΰ�� true, �ƴѰ�� false   
			boolean isPrime = true;
			
			int num = in.nextInt();
			
			if(num == 1) {	// 1 �ΰ�� ���� �ݺ�������
				continue;
			}
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;	// �Ҽ��� �ƴϹǷ� false �� �ٲ���
					break;
				}
			}
			if(isPrime) {	// �Ҽ��ΰ�� count �� 1 ����
				count++;
			}
		}
		System.out.println(count);
	}
	

}
