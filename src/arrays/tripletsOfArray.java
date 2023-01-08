package arrays;

import java.util.Scanner;

//count no.of triplets in a array
//Triplet :- arr[i]<arr[j]<arr[k]
public class tripletsOfArray {
    public static int noOfTriplets(int[]A){
        int n = A.length;
        int tripCount = 0;
        for(int j=1 ; j<n-1 ; j++){
            int left_small = 0;
            for(int i=j-1 ; i>=0 ; i--){
                if(A[i]<A[j]){
                    left_small++;
                }
            }
            int right_small = 0;
            for(int k=j+1 ; k<n ; k++){
                if(A[k]>A[j]){
                    right_small++;
                }
            }
            tripCount = tripCount+(left_small*right_small);
        }
        return tripCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(noOfTriplets(arr));
    }
}
