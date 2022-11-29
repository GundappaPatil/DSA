package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class leftMax_rightMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
      int[] leftMax = new int[N];
        leftMax[0] = arr[0];
        for(int  i=1 ; i<N ; i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        int[] rightMax = new int[N];
        rightMax[N-1] = arr[N-1];
        for(int i=N-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        System.out.println(Arrays.toString(rightMax));
    }
}
