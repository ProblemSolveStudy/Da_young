package step3;

import java.util.HashSet;

public class Hashtest {
	public static void main(String[] args) {
		
		// 선언: HashSet<데이터타입> 변수명 = new HashSet<데이터타입>();
		HashSet<Integer> set = new HashSet<Integer>(); // int HashSet 변수 선언
		HashSet<String> set2 = new HashSet<String>(); // String HashSet 변수 선언
		
		// HashSet 값 추가
		
		//int 값 추가> null 값 인식. 중복 값 삭제
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);
		set.add(1);
		
		// string 값 추가
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("a");

		// HashSet 값 삭제
		set.remove(null);
		// set.clear(); 전부 삭제
		
		set2.remove("a");
		// set2.clear(); 전부 삭제
		
		System.out.println("set의 크기: " + set.size());
		System.out.println("set2의 크기: " + set2.size());
		
		
	}
}
