package sort;

import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {


    //    Bubble sort is having T.C = O(N^2) S.C = O(1)
    //    Bubble sort is a stable sort
    public static void bubbleSort(int[]A){
        int n = A.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
    }
}
