package step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		ArrayList<Integer> list = new ArrayList<>(); // list 계열 중 하나를 쓰면 된다.
				
		int n= in.nextInt();

		
		for(int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);}
}
