import java.util.*;
class Twodbs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while(row <arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1, -1};

    }
}