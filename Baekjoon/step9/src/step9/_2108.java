package step9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _2108 {

	public static void main(String[] args) {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()); 
		int[] arr = new int[n]; // ���� ������ �迭
		int a = 0; // ������
		int b = 0; // �߾Ӱ�
		int c = 0; // �ֺ�
		int d = 0; // ����
		
		// ���� �Է�
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		// ������
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		a = (int)Math.round(((double)sum /n));
		
		// �߾Ӱ�
		Arrays.sort(arr);
		b = arr[n/2];

		// �ֺ�
		int[] plus = new int[4002];
		int[] minus = new int[4001];
		for(int i=0;i<n;i++) {
			// 0 ~ 4000 �� ����
			if(arr[i] <0) {
				minus[Math.abs(arr[i])]++;
			}
			
			// -1 ~ -4000 �� ����
			else {
				plus[arr[i]]++;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// ���� ���� �󵵼� üũ
		int max = 0;
		for(int i=0; i<plus.length;i++) {
			max = Math.max(max, plus[i]);
			
		}
		for(int i=0; i<minus.length;i++) {
			max = Math.max(max, minus[i]);
		}
		
		// ���� �� ���� ���ڵ� ���� ArrayList�� ���
		for(int i : arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
			else {
				if(plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}
		
		// 2�� �̻��̸� 2��°�� ���� �� ���
		if(list.size()>=2) {
			c = list.get(1);
		}
		// 1���� �״��
		else {
			c = list.get(0);
		}
		
		// ����
		d = arr[n-1] - arr[0];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
			
		}
		
		
		
	}


