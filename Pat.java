import java.util.Scanner;

public class Pat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat1(n);
        pat2(n);
        pat3(n);
    }
    static void pat1(int n){
        for(int i=1;i<2*n;i++){
            
            int col = i > n ? 2*n-i : i;
            int space = n-col;
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    static void pat3(int n){
        for(int i=1;i<=2*n;i++){
            int col = i>n?2*n-i+1:i;
            int space = n-col;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=col;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=col;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
    
}
