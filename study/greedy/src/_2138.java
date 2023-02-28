import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _2138 {
	  static int n;
	    static int[] bulb;
	    static int[] target;
	    public static void main(String[] args) throws IOException{
	    
	        // �־��� ������ �����Ѵ�.
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        n = Integer.parseInt(br.readLine());
	        bulb = new int[n];
	        target = new int[n];
	        
	        // s0�� ���� ������ �������� �ʰ� ����
	        // s1�� ���� ������ �����ϰ� ����
	        int[] s0 = new int[n];
	        int[] s1 = new int[n];
	        
	        String s = br.readLine();
	        for(int i=0; i < n; i++){
	            bulb[i] = s.charAt(i) - '0';
	            s0[i] = s.charAt(i) - '0';
	            s1[i] = s.charAt(i) - '0';
	        }
	        
	        s = br.readLine();
	        for(int i=0; i < n; i++){
	            target[i] = s.charAt(i) - '0';
	        }
	        
	        // a0�� s0�� �迭���� switch�� ���� Ƚ�� - 0���� ����
	        // a1�� s1�� �迭���� switch�� ���� Ƚ�� - 1�� ����
	        int a0 = 0;
	        int a1 = 1;
	        
	        for(int i=0; i < n; i++){
	            // ���� ù ��ġ������ s1 �迭�� ��� 0��°�� 1��°�� �����ϰ� �����Ѵ�.
	            if(i == 0){
	                s1[i] = s1[i] ^ 1;
	                s1[i+1] = s1[i+1] ^ 1;
	            } else {
	                // ���� s0 �迭�� �� ��ġ�� ������� �ϴ� ������ ��ġ�� �ٸ� ���¶��
	                if(s0[i-1] != target[i-1]){
	                    // ����ġ�� ������.
	                    change(s0, i);
	                    
	                    // ���� Ƚ�� +1
	                    a0++;
	                }
	                
	                // �������� �����ߴµ� ���� �ٸ��ٸ� �ִ밪���� ����
	                if(i == n-1 && s0[i] != target[i]) a0 = Integer.MAX_VALUE;
	                
	                // ���� s1 �迭�� �� ��ġ�� ������� �ϴ� ������ ��ġ�� �ٸ� ���¶��
	                if(s1[i-1] != target[i-1]){
	                    // ����ġ�� ������.
	                    change(s1, i);
	                    
	                    // ���� Ƚ�� +1
	                    a1++;
	                }
	                
	                // �������� �����ߴµ� ���� �ٸ��ٸ� �ִ밪���� ����
	                if(i == n-1 && s1[i] != target[i]) a1 = Integer.MAX_VALUE;
	            }
	        }
	        
	        // �� �� �ִ밪�̶�� ������ �Ұ����� ����̹Ƿ� -1�� ���
	        if(a0 == Integer.MAX_VALUE && a1 == Integer.MAX_VALUE){
	            System.out.println(-1);
	        // �� �ܿ��� �� ���� ���� ���
	        } else {
	            System.out.println(Math.min(a0, a1));    
	        }
	        br.close();
	    }
	    
	    private static void change(int[] arr, int i){
	        // ������ �κ��̶�� �ڽ� ���Ĵ� ��ȯ�� �Ұ��ϴ�.
	        if(i == n-1){
	            arr[i-1] = arr[i-1] ^ 1;
	            arr[i] = arr[i] ^ 1;
	        // �� ���� ��� ��쿡�� �� �� ���� ��ȯ�� ���Ѿ� �Ѵ�.
	        } else {
	            arr[i-1] = arr[i-1] ^ 1;
	            arr[i] = arr[i] ^ 1;
	            arr[i+1] = bulb[i+1] ^ 1;
	        }
	    }
	}
