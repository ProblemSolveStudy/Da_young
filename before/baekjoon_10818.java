package smaple1;
import java.util.Scanner;

public class baekjoon_10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n]; // 배열 함수 선언하기

		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
		    if(max<arr[i]) {
			//max의 값보다 array[i]이 크면 max = array[i]
			max = arr[i];
		    }
					
		    if(min>arr[i]) {
			//min의 값보다 array[i]이 작으면 min = array[i]
			min = arr[i];
		    }
		}
				
		System.out.println(min+ " "+max);
			}
	}

