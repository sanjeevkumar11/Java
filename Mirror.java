
import java.util.Scanner;
public class Mirror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean mirror=true;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[arr[i]]!= i) {
				mirror=false;
				break;
			}
		}
		if(mirror) {
			System.out.println("Mirror Inverse");
		}
		else {
			System.out.println("No Mirror Inverse");
		}
		sc.close();
	}

}
