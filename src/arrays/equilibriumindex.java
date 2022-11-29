package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class equilibriumindex {
    public static boolean equilibriumindex(int[]A){
        int N = A.length;
        int[] PS = new int[N];
        PS[0] = A[0];
        for(int i=1 ; i<N ; i++){
            PS[i] = PS[i-1] + A[i];
        }
        for(int i=0 ; i<N ; i++){
            int L = 0;
            if(i>0){
                L = PS[i-1];
            }
            int R = PS[N-1]-PS[i];
            if(L==R){
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
        System.out.println(equilibriumindex(arr));

    }
}
