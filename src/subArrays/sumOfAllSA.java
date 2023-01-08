package subArrays;

import java.util.Scanner;

public class sumOfAllSA {
    public static int sumOfAllSA(int[]A){
        int n = A.length;
        int ans  = 0;
        for(int i=0 ; i<n ; i++){
            ans = ans+A[i]*(i+1)*(n-i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfAllSA(arr));
    }
}
