package step9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _10814_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		person[] p =new person[n];
		
		for(int i=0; i<n; i++) {
			p[i] = new person(in.nextInt(), in.next());
		}
		
		Arrays.sort(p, new Comparator<person>() {

			@Override
			public int compare(person o1, person o2) {
				return o1.age - o2.age;
			}
			});
			// 나이순으로 정렬
StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
			sb.append(p[i]);
		}
        
		System.out.println(sb);
		
	}
    
	public static class person {
		int age;
		String name;
        
		public person(int age, String name) {
			this.age = age;
			this.name = name;
		}
        
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
		
	}

}
