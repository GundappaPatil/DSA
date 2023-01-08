package subArrays;

import java.util.Arrays;

public class printDiagonals {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int N = arr.length;
        int M = arr[0].length;
        int[][] res = new int[2*N-1][N];
        for(int c=0 ; c<M ; c++){
            int i = 0;
            int j = c;
            while(i<N && j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }
        for(int r=1 ; r<N ; r++){
            int i = r;
            int j = M-1;
            while(i<N && j>=0){
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
            System.out.println();
        }


    }
}
