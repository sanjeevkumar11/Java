package Test;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			boolean visited=false;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					visited=true;
					break;
				}
			}
			if(visited) {
				continue;
			}
			for(int k=0;k<n;k++) {
				if(arr[i]==arr[k]) {
					count++;
				}
			}
			System.out.println(arr[i]+":"+count);
		}
}
}
