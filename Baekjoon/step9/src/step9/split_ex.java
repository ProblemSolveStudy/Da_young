package step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class split_ex {

	public static void main(String[] args) {
		// for문을 이용한 split -> list 변환
		String str = "a,b,c,d,e,f,g";
		List<String> list = new ArrayList<String>();

		String[] splitStr = str.split(",");
		for(int i=0; i<splitStr.length; i++){
		    list.add(splitStr[i]);
		}
		System.out.println(list);
		
		// Array.asList를 이용한 변환 ( 위에 방법보다 빠름 )
		String str2 = "a,b,c,d,e,f,g";
		List<String> list2 = Arrays.asList(str.split(","));
		System.out.println(list2);
		
	}

}
