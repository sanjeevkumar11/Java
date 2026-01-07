
import java.util.Scanner;

public class Test2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Sorting an array
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted array:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		//Second Smallest Element
		System.out.println("The second smallest element: "+ arr[1]);
		//Copy an array into another
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
		sc.close();
	}
}
