import java.util.StringTokenizer;

public class stringtokenizer {
public static void main(String[] args) {
	String str = "오늘은 수요일 기분 좋은 수요일";
	StringTokenizer st = new StringTokenizer(str);
	
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());
	
	}
	
}

