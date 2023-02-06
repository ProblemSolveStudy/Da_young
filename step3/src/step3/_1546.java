package step3;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[] score = new double[in.nextInt()];

		
		for (int i = 0; i < score.length; i++) {
			score[i] = in.nextInt();
		}

		double sum = 0;
		Arrays.sort(score);
		
		for(int i=0; i<score.length; i++) {
			sum += ((score[i]/score[score.length-1]) *100);
		}
	
		System.out.println(sum/score.length);
}
}
