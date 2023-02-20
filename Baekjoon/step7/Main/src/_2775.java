import java.util.Scanner;

public class _2775 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int[][] apt = new int [15][15];
	
	for(int i=0; i<15; i++) { // 1층부터 14층 까지
		apt[i][1] =1; // 1층 1호
		apt[0][i] =i; // 0층 i호에는 무조건 i명이 산다
	}
		
	for (int i=1; i<15; i++) { // 1층부터 14층까지
		for(int j=2; j<15; j++) { // 2호부터 14호까지
			apt[i][j] = apt[i][j-1]+apt[i-1][j];	
			}
		}
	
	int t = in.nextInt();
	
	for(int i=0; i<t; i++) {
		int k = in.nextInt();
		int n = in.nextInt();
		System.out.println(apt[k][n]); // k층 n호에 있는 사람 수 출력
	}
	
	}
	
	
}

