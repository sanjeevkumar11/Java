package Test;
import java.util.Scanner;
import java.util.ArrayList;
public class Alternate {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		int[] res = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				pos.add(arr[i]);
			}
			else {
				neg.add(arr[i]);
			}
		}
		int p=0,ne=0,i=0;
		while (p < pos.size() && ne < neg.size()) {
			if(i%2 == 0) {
				res[i]=pos.get(p++);
			}
			else {
				res[i]=neg.get(ne++);
			}
			i++;
		}
		while (p < pos.size()) {
			res[i++] = pos.get(p++);
		}
        while (ne < neg.size()) {
        	res[i++] = neg.get(ne++);
        }
		for(int k=0;k<n;k++) {
			System.out.print(res[k]+" ");
		}
	}
}
