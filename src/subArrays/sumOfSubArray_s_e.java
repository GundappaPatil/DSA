package subArrays;

import java.util.Scanner;

public class sumOfSubArray_s_e {
    public static int sumSubArray(int[]A,int s,int e){
        int n = A.length;
        int sum = 0;
        for(int i=s ; i<=e ; i++){
            sum = sum+A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(sumSubArray(arr,s,e));
    }
}
