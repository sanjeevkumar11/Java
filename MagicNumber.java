import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n&1;
            ans += last * base;
            base = base * 5;
            n = n >> 1;
        }
        System.out.println(ans);
        sc.close();
    }
}
