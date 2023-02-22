package step9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _10814 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[][]  = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[][2]= in.nextInt();
			
			Arrays.sort(arr,new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					if(s1.length() == s2.length()) {
						return s1.compareTo(s2);
					} else {
						return s1.length() - s2.length();
					}
			
			
		}
		
	

}
