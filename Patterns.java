import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1;i<n*2;i++){
            int col = i>n ? 2*n - i : i;
            for(int j=1;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
