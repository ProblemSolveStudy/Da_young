import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _11047 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt(); 
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		int count = 0;
		
		for(int i = n - 1; i >= 0; i--) {
			 
			// ���� ������ ��ġ�� K���� �۰ų� ���ƾ��� ���������ϴ�.
			if(arr[i] <= k) {
				// ���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
				count += (k / arr[i]);
				k = k % arr[i];
			}
		}
		System.out.println(count);
		
		
	}

}
