package subArrays;

import java.util.Scanner;

public class sumOfEachSubArray {
    public static void sumOfSubArray(int[]A){
        int[] PS = new int[A.length];
        PS[0] = A[0];
        for(int i=1 ; i<A.length ; i++){
            PS[i] = PS[i-1]+A[i];
        }
        for(int s=0 ; s<A.length ; s++){
            for(int e=s ; e<A.length ; e++){
                int sum ;
                if(s==0){
                    sum = PS[e];
                }else{
                    sum = PS[e]-PS[s-1];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        sumOfSubArray(arr);
    }
}
