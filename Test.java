
import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		}
	
	//Sum of all elements in an array
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	System.out.println("The Sum:"+sum);
	//Maximum and Minimum element in an array
	int max=arr[0],min=arr[0];
	for(int i=0;i<n;i++) {
		if(max>arr[i]) {
			max=arr[i];
		}
		if(min<arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("The Maximum number:"+max);
	System.out.println("The Minimum number:"+min);
	
	sc.close();
}
}