package arrays;

import java.util.Scanner;

//KADANE`S Algorithm;

public class maxSubArray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<N ; i++){
            sum = sum+arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
