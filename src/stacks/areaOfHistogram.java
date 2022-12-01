package stacks;

import java.util.Arrays;
import java.util.Stack;

public class areaOfHistogram {
    static int[] nSEL(int[] A ){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
//        ans[0] = -1;
//        st.push(0);
        for(int i=1 ; i<n ; i++){
            while(!st.empty() && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    static int[] nSER(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
//        ans[n-1] = -1;
//        st.push(n-1);
        for(int i=n-1 ; i>=0 ; i--){
            while(!st.empty() && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = n;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }


    static int areaOfHistogram(int[]A){
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int[] SL = nSEL(A);
        int[] SR = nSER(A);
        for(int i=0 ; i<n ; i++){
            int w = SR[i]-SL[i]-1;
            int h = A[i];
            int area = w*h;
            ans = Math.max(ans,area);
        }
//        if(ans == -1){
//            return -1*ans;
//        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 47, 69, 67, 97, 86, 34, 98, 16, 65, 95, 66,
                69, 18, 1, 99, 56, 35, 9, 48, 72, 49, 47, 1, 72, 87,
                52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39, 84, 16,
                15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31,
                24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12,
                66, 87, 86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11,
                30, 72, 51, 61, 56, 41, 30, 71, 12, 44, 81, 43, 43, 27 };
        int N = arr.length;
        System.out.println(Arrays.toString(nSEL(arr)));
        System.out.println(Arrays.toString(nSER(arr)));
        System.out.println(areaOfHistogram(arr));
    }
}
