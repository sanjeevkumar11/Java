package Test;
import java.util.Scanner;
public class Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int temp=arr[0];
			for(int j=0;j<n;j++) {
				if(j==n-1) {
					arr[j]=temp;
				}
				else {
					arr[j]=arr[j+1];
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");		}
	}
}
