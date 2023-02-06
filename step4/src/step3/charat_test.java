package step3;

public class charat_test {

public static void main(String[] args) {
	
	String ex = "안녕하세요";
	char target1;
	char target2;
	char target3;
	
	target1 = ex.charAt(0);
	target2 = ex.charAt(1);
	target3 = ex.charAt(2);
	
	System.out.println(target1);
	System.out.println(target2);
	System.out.println(target3);
	
	System.out.println("//");
	
	int exlength = ex.length()-1;
	while(exlength >= 0) {
		char target;
		target = ex.charAt(exlength);
		System.out.println(target);
		exlength--;

	}
	
	System.out.println("//");

	String numbers = "12345";

	// 숫자로 구성된 String 변수에서 특정 숫자를 바로 int 변수로 가져올 수 있다.
	int targetNumber1 = numbers.charAt(0) - '0';
	int targetNumber2 = numbers.charAt(1) - '0';
	int targetNumber3 = numbers.charAt(2) - '0';

	System.out.println("targetNumber1 = "+targetNumber1);
	System.out.println("targetNumber2 = "+targetNumber2);
	System.out.println("targetNumber3 = "+targetNumber3);

	int test1 = 10 - targetNumber1;
	int test2 = 10 - targetNumber2;
	int test3 = 10 - targetNumber3;

	System.out.println("10 - targetNumber1 = "+test1);
	System.out.println("10 - targetNumber2 = "+test2);
	System.out.println("10 - targetNumber3 = "+test3);

}	
	
}
