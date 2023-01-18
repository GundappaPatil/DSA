package sort;

import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

//    Selection sort is having T.C = O(N^2) S.C = O(1)
//    Selection sort is not a stable sort
    public static void selectionSort(int[] A){
        int n = A.length;
        for(int i=0 ; i<n ; i++){
            int min = A[i];
            int min_idx = i;
            for(int j=i+1 ; j<n ; j++){
                if(A[j]<min){
                    min = A[j];
                    min_idx = j;
                }
            }
            int temp = A[i];
            A[i] = A[min_idx];
            A[min_idx] = temp;
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
    }
}
