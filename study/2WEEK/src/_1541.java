import java.util.Scanner;

public class _1541 {

	public static void main(String[] args) {
	 
				Scanner in = new Scanner(System.in);
		 
				int sum = Integer.MAX_VALUE;	// �ʱ� ���� ���� Ȯ���� ���� ������ ���� 
				String[] sub = in.nextLine().split("-");
				
		 
				for(int i = 0; i < sub.length; i++) {
					int temp = 0;
		 
					// �������� ���� ��ū�� �������� �и��Ͽ� �ش� ��ū���� ���Ѵ�.
					String[] add = sub[i].split("\\+");
					
					// �������� ���� ��ū���� ��� ���Ѵ�. 
					for(int j = 0; j < add.length; j++) {
						temp += Integer.parseInt(add[j]);
					}
					
					// ù ��°��ū�� ��� temp���� ù ��° ���� ��
					if (sum == Integer.MAX_VALUE) {
						sum = temp;
					} else {
						sum -= temp;
					}
				}
				System.out.println(sum);
			}
		 
		
	

}
