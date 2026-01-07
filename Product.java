import java.util.*;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int prod=1;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					prod*=arr[j];
				}
			}
			arr1[i]=prod;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		sc.close();
	}
}
