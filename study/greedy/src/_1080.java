import java.util.Scanner;

public class _1080 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // ют╥б
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        
        for(int i=0; i<n;i++) {
        	String arr = sc.next();
        	
        	for(int j=0; j<m; j++) {
        		a[i][j] = arr.charAt(j) -'0';
        	}
        }
        
        for(int i=0; i<n;i++) {
        	String arr = sc.next();
        	
        	for(int j=0; j<m; j++) {
        		b[i][j] = arr.charAt(j) -'0';
        	}
        }
        
        int count = 0;
        
        for(int i=0; i<=n ; i++) {
        	for(int j=0; j<=m; j++) {
        		if(a[i][j] != b[i][j]) {
        			count++;
        			for(int k=i; k<i+3; k++) {
        				for(int q=j; q<j+3; q++) {
        					a[k][q] = (a[k][q] == 0 ) ? 1: 0;
        				}
        			}
        		}
        	}
        }
        
        boolean flag = true;
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		if(a[i][j] != b[i][j]) {
        			flag= false;
        			break;
        		}
        			
        	}
        }
        
        System.out.println((flag) ? count : -1);
        
	}

}
