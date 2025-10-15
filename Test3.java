package Test;

import java.util.Scanner;

public class Test3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count = 0;
			boolean visited = false;
			for(int k=0;k<i;k++) {
				if(arr[k]==arr[i] ){
					visited = true;
					break;
				}
			}
			if(visited) {
				continue;
			}
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
		}
	}
}
