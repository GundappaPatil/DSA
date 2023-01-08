package subArrays;

import java.util.Scanner;

public class printSubArrays {
    public static void subArray_s_e(int [] A,int s,int e){
        int n = A.length;
        for(int i=s ; i<=e ; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
//    public static int sumOfSubArray_s_e(int[]A,int s,int e){
//        int n = A.length;
//        int sum = 0;
//        for(int i=s ; i<=e ; i++){
//            sum = sum+A[i];
//        }
//        return sum;
//    }
    public static void printAllSubArrays(int[] A){
        int n = A.length;
        for(int s=0 ; s<n ; s++){
            for(int e=s ; e<n ; e++){
                subArray_s_e(A,s,e);
//                int sum = sumOfSubArray_s_e(A,s,e);
//                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        printAllSubArrays(arr);
    }
}
