package twod_array;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int N = arr.length;
        int M = arr[0].length;
        for(int i=0 ; i<N ; i++){
            for(int j=i+1 ; j<M ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
