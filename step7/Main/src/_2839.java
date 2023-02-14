import java.util.Scanner;

public class _2839 {
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	int n = in.nextInt(); // n킬로그램

	if((n/5) < 1 ||  (n/3) <1) {
		System.out.println((n%5)/3);
		System.out.println("-1");
	}
	
	else {
		 int f = n/5 ; // 5킬로그램 
		 
		 if(((n%5)/3) <=1) {
			int t= 1;
		 	System.out.println(f+t);
		 }
		 else {
			int t = (n%5)/3;
			System.out.println(f+t);
		 }
	}
	

}
}
