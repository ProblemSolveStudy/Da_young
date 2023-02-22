package step8;

import java.io.*;
import java.util.*;

public class _1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int i;
		boolean arr[] = new boolean[N+1];
		arr[0] = arr[1] = true; // 0�� 1�� �Ҽ����� ����.

		// �����佺�׳׽��� ü ���
		int sqrt = (int) Math.sqrt(N);
		for(i=2; i<=sqrt; i++) {

			for(int j=2; j<=N/i; j++) {
					if(arr[i*j] == true) {
						continue;
					}
					else  {
						arr[i*j] = true;
					}
			}	
		}

		for(i=M; i<=N; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}