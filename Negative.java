package Test;
import java.util.Scanner;
public class Negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Replace negative numbers with their square
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				arr[i]*=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		//Difference Between Largest and Smallest element in an array
		int max=arr[0],min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		int res=max-min;
		System.out.println(res);
	}
}
