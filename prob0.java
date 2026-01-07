
import java.util.Scanner;
public class prob0 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of 2 numbers:"+(a+b));
		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+" is odd");
		}
		int res = a>b? a: b;
		System.out.println("The largest number:"+res);
		if(a>0) {
			System.out.println(a+" is positive number");
		}
		else if(a<0) {
			System.out.println(a+" is negative number");
		}
		else {
			System.out.println(a+" is zero");
		}
		sc.close();
	}
}
