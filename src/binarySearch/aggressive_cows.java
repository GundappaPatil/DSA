package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class aggressive_cows {

    public static int aggCows(int[]A,int B){
        int n = A.length;
        int s = 1;
        int e = A[n-1]-A[0];
        int ans = Integer.MIN_VALUE;
        int mid = 0;
        while(s<=e){
            mid = s+(e-s)/2;
            if(check(A,mid,B)){
                ans = Math.max(ans,mid);
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static boolean check(int[]A,int m,int B){
        int N = A.length;
        int preCow = A[0];
        int cowPlaced = 1;
        for(int i=1 ; i<N ; i++){
            if(A[i]-preCow>=m){
                cowPlaced++;
                preCow = A[i];
            }
            if(cowPlaced==B){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        int cows = sc.nextInt();
        System.out.println(aggCows(arr,cows));
    }
}
