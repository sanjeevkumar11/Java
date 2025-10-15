package Test;
import java.util.Scanner;
public class Equilibrium {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found = false;
		for(int i=0;i<n;i++) {
			int lsum=0;
			int rsum=0;
			for(int j=0;j<i;j++) {
				lsum+=arr[j];
			}
			for(int k=i+1;k<n;k++) {
				rsum+=arr[k];
			}
			if(lsum == rsum) {
				System.out.println("Equilibrium at "+i);
				found = true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("No Equilibrium");
		}
	}
}
