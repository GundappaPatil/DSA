package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class missingNatural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<N ; i++){
            if(arr[i]<=0){
                arr[i] = N+1;
            }
        }
        for(int i=0 ; i<N ; i++){
            int j=1;
            while(j<=N){
                if(arr[i]==j){
                    arr[arr[i]-1] = -1*Math.abs(arr[arr[i]-1]);
                }
                j++;
            }
        }
        for(int i=0 ; i<N ; i++){
            if(arr[i]>0 && arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
