import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int mindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[mindex]){
                    mindex = j;
                }
            }
            int temp = arr[mindex];
            arr[mindex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
