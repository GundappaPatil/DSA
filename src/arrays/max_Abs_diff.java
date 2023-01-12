package arrays;

import java.util.Scanner;

//Maximum Absolute Difference
//You are given an array of N integers, A1, A2, .... AN.
//Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
//f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

public class max_Abs_diff {
    public static int maxAbsSum(int[] A){
        int n  = A.length;
        int ans = 0;
        int m1 = Integer.MAX_VALUE;
        int M1 = Integer.MIN_VALUE;
        int m2 = Integer.MAX_VALUE;
        int M2 = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            m1 = Math.min(m1,A[i]-i);
            M1 = Math.max(M1,A[i]-i);
            m2 = Math.min(m2,A[i]+i);
            M2 = Math.max(M2,A[i]+i);
            int x = M1-m1;
            int y = M2-m2;
            ans = Math.max(x,y);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxAbsSum(arr));
    }
}
