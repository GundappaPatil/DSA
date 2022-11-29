package stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nearestSmallestEle {
    static int[] nearestSmallerEle(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(A[0]);
        for(int i=1 ; i<n ; i++){
            while(!st.empty() && st.peek()>=A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(A[i]);
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
        System.out.println(Arrays.toString(nearestSmallerEle(arr)));
    }
}
