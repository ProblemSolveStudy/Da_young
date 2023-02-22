package step9;

public class MathAbs {

	public static void main(String[] args) {

        	int intNum = -1;
	        int intAbs = Math.abs(intNum);
	        System.out.println(intAbs); // 1
	 
	        long longNum = -1;
	        long longAbs = Math.abs(longNum);
	        System.out.println(longAbs); // 1
	 
	        double doubleNum = -1.1;
	        double doubleAbs = Math.abs(doubleNum);
	        System.out.println(doubleAbs); // 1.1
	 
	        float floatNum = -1.1f;
	        float floatAbs = Math.abs(floatNum);
	        System.out.println(floatAbs); // 1.1
		
	}

}
