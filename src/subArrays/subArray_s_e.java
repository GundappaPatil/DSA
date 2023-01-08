package subArrays;


//print values of subArray from s-e

import java.util.Scanner;

public class subArray_s_e {
    public static void subArrS_E(int[]A,int s,int e){
        int n = A.length;
        for(int i=s ; i<=e ;i++){
            System.out.print(A[i]+" ");
        }
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
        subArrS_E(arr,s,e);
    }
}
