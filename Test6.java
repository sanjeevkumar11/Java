
import java.util.Scanner;

public class Test6 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			
		}
		int[] temp = new int[n];
		int n1=0;
		for(int i=0;i<n;i++) {
			boolean duplicate = false;
			for(int j=0;j<n;j++) {
				if(arr[i]==temp[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				temp[n1]=arr[i];
				n1++;
			}
		}
		for(int i=0;i<n1;i++) {
			System.out.println(temp[i]+" ");
		}
		sc.close();
}
}
