package step8;

import java.util.Scanner;

public class _2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	    Byte N = sc.nextByte();
	    Byte M = sc.nextByte();
	        		
		int[][] arr1= new int[N][M];
		int[][] arr2= new int[N][M];
		
		//arr1 2차배열 값 입력
        for(int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                arr1[i][j] = sc.nextByte();
            }
        }
        //arr2 2차배열 값 입력
        for(int i = 0 ; i < N ; i++) {
            for (int j = 0; j < M; j++) {
                arr2[i][j] = sc.nextByte();
            }
        }
        
        // arr1와 arr2의 각각의 인덱스 값 합 출력
        for(int i = 0 ; i < N ; i++) {
             for (int j = 0 ; j < M ; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                if(j == M-1)
                    System.out.println();
			}

		
		
		
        }
        }
	}


