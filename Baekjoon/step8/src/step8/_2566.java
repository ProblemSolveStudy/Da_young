package step8;

import java.util.Scanner;

public class _2566 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	
    int arr[][] = new int [9][9];
    int maxNum = 0, x=0, y=0;
    
    for(int i=0; i<arr.length; i++)
    	for(int j=0; j<arr.length; j++) {
    		arr[i][j] = in.nextInt();
    	
    		if(arr[i][j] > maxNum) {
    			maxNum = arr[i][j];
    			x= i;
    			y=j;
    	}
  
    System.out.println(maxNum);
    System.out.println((x+1) + " " + (y+1));
    
    }
}}
	
	

