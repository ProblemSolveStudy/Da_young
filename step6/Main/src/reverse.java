
public class reverse {
public static void main(String[] args) {
	
	String str = "abcde12345"; 
	
	StringBuffer sb = new StringBuffer(str);
	String reverse_sb = sb.reverse().toString();
	
	System.out.println(reverse_sb);
	
    String str2 = "abcde";

    char[] arr = str2.toCharArray(); // String -> char[]
    char[] reversedArr = new char[arr.length];
    for(int i=0; i<arr.length; i++){
        reversedArr[arr.length-1-i] = arr[i];
    }

    String reversedStr = new String(reversedArr);
    System.out.println(reversedStr); // edcba
	
}
}
