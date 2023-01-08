package twod_array;

import java.util.Arrays;

public class rangeSum_query {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[][] arr = {{1,4},{2,3}};
        int N = arr.length;
        int[] ans = new int[N];
        int[] Ps = new int[A.length];
        Ps[0] = A[0];
        for(int i=1 ; i<A.length ; i++){
            Ps[i] = Ps[i-1]+A[i];
        }
        for(int i=0 ; i<N ; i++){
                int s = arr[i][0]-1;
                int e = arr[i][1]-1;

                if(s==0){
                    ans[i]=Ps[e];
                }else{
                    ans[i] = Ps[e]-Ps[s-1];
                }
            }
        System.out.println(Arrays.toString(ans));
    }
}
