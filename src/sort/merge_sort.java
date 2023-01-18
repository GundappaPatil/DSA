package sort;

import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
    public static void mergeSort(int[]A,int[]B){
        int N = A.length;
        int M = B.length;
        int[] C = new int[N+M];
        int i=0 , j=0 , k=0;
        while(i<N && j<M){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
                k++;
            }
            else {
                C[k]=B[j];
                j++;
                k++;
            }
        }
        while(i<N){
            C[k]=A[i];
            i++;
            k++;
        }
        while(j<M){
            C[k]=B[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(C));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int[] brr = new int[M];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<M ; i++){
            brr[i] = sc.nextInt();
        }

        mergeSort(arr,brr);
    }
}
