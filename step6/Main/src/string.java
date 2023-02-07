
public class string {
public static void main(String[] args) {
	
	// split 함수를 활용하여 단어를 string 배열에 한글자씩 저장하기
	String word = "POWER";
	String[] array_word;
	
	array_word = word.split("");
	
	for(int i=0; i<array_word.length; i++) {
		System.out.println(array_word[i]);
	}

	// charat 함수를 활용하여 단어를 char 배열에 한글자씩 저장하기
	String word2 = "STAR";
	String[] array_word2;
	
	array_word2 = word2.split("");
	
	for(int i=0; i<array_word2.length; i++) {
		System.out.println(array_word2[i]);
	}


}

	
}
