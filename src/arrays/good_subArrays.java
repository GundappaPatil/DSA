package arrays;

//Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
// 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
// 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//    Your task is to find the count of good subarrays in A.


import java.util.Scanner;

public class good_subArrays {
    public static int goodSubArray(int[]A,int B){
        int n = A.length;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j=i ; j<n ; j++){
                sum = sum+A[j];
                if(sum<B && (j-i+1)%2==0){
                    count++;
                } else if (sum>B && (j-i+1)%2!=0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(goodSubArray(arr,4));
    }
}
